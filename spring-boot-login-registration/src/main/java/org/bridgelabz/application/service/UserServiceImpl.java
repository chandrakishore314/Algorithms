package org.bridgelabz.application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.bridgelabz.application.Utility.DateTime;
import org.bridgelabz.application.Utility.TokenImpl;
import org.bridgelabz.application.configuration.UserConfiguration;
import org.bridgelabz.application.model.LoginDTO;
import org.bridgelabz.application.model.User;
import org.bridgelabz.application.model.UserDTO;
import org.bridgelabz.application.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserConfiguration userConfiguration;

	@Autowired
	private JavaMailSender javaMailSender;

	/*
	 * @Autowired private SimpleMailMessage msg;
	 */

//To save the user details in the DATABASE
	@Transactional
	// Change method name registration
	public void save(UserDTO userdto) {
		System.out.println(" entered into registration service ");
		ModelMapper modelMapper = userConfiguration.getModelMapper();
		User user = modelMapper.map(userdto, User.class);
		user.setPassword(userConfiguration.bCryptPasswordEncoder().encode(user.getPassword()));
		user.setDate(DateTime.today());
		userRepository.save(user);
		int currentUserId = userRepository.getId(user.getEmail());
		String token = TokenImpl.jwtToken(currentUserId);
		String url = "http://localhost:8085/user/verify?token=" + token;
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(user.getEmail());
		msg.setSubject("Testing from Spring Boot");
		msg.setText("click this url to verify Your email  " + url);
		javaMailSender.send(msg);
	}

//To check the User login credentials	
	@Transactional
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
	@Transactional
	public boolean verifyuser(String token) {
		int id = TokenImpl.parseJWT(token);
		userRepository.updateVerify(id);
		return false;

	}

	// To update the User is verified
	@Override
	@Transactional
	public boolean verifyemail(String email) {
		int currentUserId = userRepository.getId(email);
		String token = TokenImpl.jwtToken(currentUserId);
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(email);
		msg.setSubject("Testing from Spring Boot");
		msg.setText("click this url to verify Your email  " + token);
		javaMailSender.send(msg);
		return false;
	}

	// To upadate the User is verified
	@Transactional
	@Override
	public void updateUserPassword(String token, String password) {
		int id = TokenImpl.parseJWT(token);

		password = userConfiguration.bCryptPasswordEncoder().encode(password);
		userRepository.updatePassword(id, password);

	}

}
