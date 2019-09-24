package org.bridgelabz.fundoonotes.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.bridgelabz.fundoonotes.Utility.DateTime;
import org.bridgelabz.fundoonotes.Utility.TokenImpl;
import org.bridgelabz.fundoonotes.configuration.UserConfiguration;
import org.bridgelabz.fundoonotes.controller.SpringBootController;
import org.bridgelabz.fundoonotes.model.LoginDTO;
import org.bridgelabz.fundoonotes.model.User;
import org.bridgelabz.fundoonotes.model.UserDTO;
import org.bridgelabz.fundoonotes.repository.UserRepository;
import org.jboss.logging.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
@Transactional
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserConfiguration userConfiguration;

	@Autowired
	private JavaMailSender javaMailSender;
	private static final Logger LOGGER = Logger.getLogger(SpringBootController.class.getName());

	/*
	 * @Autowired private SimpleMailMessage msg;
	 */

//To save the user details in the DATABASE
	// Change method name registration
	public Boolean userRegistration(UserDTO userdto) {
		
		if(!isUserPresent(userdto.getEmail())) {
			return false;
		}
		else {
		System.out.println(" entered into registration service ");
		ModelMapper modelMapper = userConfiguration.getModelMapper();
		User user = modelMapper.map(userdto, User.class);
		user.setPassword(userConfiguration.bCryptPasswordEncoder().encode(user.getPassword()));
		user.setDate(DateTime.today());
		userRepository.save(user);
		int currentUserId = getId(userRepository.getListOfUsers());
		System.out.println("user id  "+currentUserId);
		String token = TokenImpl.jwtToken(currentUserId);
		String url = "http://localhost:8085/user/verify?token=" + token;
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(user.getEmail());
		msg.setSubject("Testing from Spring Boot");
		msg.setText("click this url to verify Your email  " + url);
		javaMailSender.send(msg);
		return true;
	}
		
	}

private int getId(List<User> listOfUsers) {
	int id = 0;
	for(User user:listOfUsers) {
		 id= user.getUserId();
	}
	return id;
	}

private boolean isUserPresent(String email) {
	List<User> listofusers = userRepository.getListOfUsers();
	List<User> users =listofusers.stream().filter(User->User.getEmail().equals(email)).collect(Collectors.toList());
	if(users.isEmpty()) {
		return true;
	}else {
		return false;
	}}

	//To check the User login credentials	
	public int checkLoginDetails(LoginDTO loginDTO) {
		int count = 0;
		List<User> listofusers = userRepository.getListOfUsers();
		BCryptPasswordEncoder encoder = userConfiguration.bCryptPasswordEncoder();
		System.out.println(loginDTO.getPassword());
		for (User user : listofusers) {
			if (loginDTO.getUsername().equals(user.getEmail())
					&& encoder.matches(loginDTO.getPassword(), user.getPassword())) {
				count = 1;
			}
		}
		return count;
	}

//To upadate the User is verified
	public boolean verifyuser(String token) {
		int id = TokenImpl.parseJWT(token);
		userRepository.updateVerify(id);
		System.out.println(id+" id  values as");
		return false;

	}

	// To update the User is verified
	@Override
	public boolean verifyemail(String email) {
		int currentUserId = getId(userRepository.getUserDetails(email));
		String token = TokenImpl.jwtToken(currentUserId);
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("Testing from Spring Boot");
		msg.setText("click this url to verify Your email  " + token);
		javaMailSender.send(msg);
		return false;
	}

	// To upadate the User is verified
	@Override
	public void updateUserPassword(String token, String password) {
		int id = TokenImpl.parseJWT(token);
		password = userConfiguration.bCryptPasswordEncoder().encode(password);
		userRepository.updatePassword(id, password);

	}

	@Override
	public List<User> getUserData(String email) {
		LOGGER.info("entered into service to fetch the data based on email");
		return userRepository.getUserDetails(email);
	}

}
