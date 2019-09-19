package org.bridgelabz.application.service;

import java.time.LocalDateTime;
import java.util.List;
import javax.transaction.Transactional;
import org.bridgelabz.application.configuration.UserConfiguration;
import org.bridgelabz.application.model.LoginDTO;
import org.bridgelabz.application.model.User;
import org.bridgelabz.application.model.UserDTO;
import org.bridgelabz.application.repository.UserRepository;
import org.bridgelabz.application.tokenimpl.TokenImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserConfiguration userConfiguration;
	@Autowired	
    private JavaMailSender javaMailSender;
	@Autowired
	TokenImpl tokenImple;
	
	/*
	 * @Autowired private SimpleMailMessage msg;
	 */
	
//To save the user details in the DATABASE
	@Transactional
	public void save(UserDTO userdto) {
		System.out.println(" entered into registration service ");
		 ModelMapper modelMapper =userConfiguration.getModelMapper();
		 User user1 = modelMapper.map(userdto, User.class);
		 user1.setPassword(userConfiguration.bCryptPasswordEncoder().encode(user1.getPassword()));
		 user1.setDate(LocalDateTime.now().toString() );
		 userRepository.save(user1);
		 
		 int id=0;
		 List<User>  listofusers=userRepository.getId(user1.getUsername());
		 for(User user:listofusers) {
			 id =user.getUserId();
		 }
		String token =tokenImple.jwtToken(id);
		String url="http://localhost:8085/verify?token="+token;
	 SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo(user1.getUsername());
	        msg.setSubject("Testing from Spring Boot");
	        msg.setText("click this url to verify Your email  "+url);
	        javaMailSender.send(msg);
	}

//To check the User login credentials	
	@Transactional
	public int checkLoginDetails(LoginDTO loginDTO) {
		int count=0;
		List<User>  listofusers=userRepository.getListOfUsers();
		BCryptPasswordEncoder encoder = userConfiguration.bCryptPasswordEncoder();
		System.out.println(loginDTO.getPassword());
		for(User user:listofusers) {
			if(loginDTO.getUsername().equals(user.getUsername()) && encoder.matches(loginDTO.getPassword(), user.getPassword())) {
				count=1;
			}
		}
		return count;
	}

	//To upadate the User is verified
	@Transactional
	public boolean verifyuser(String token) {
		int id=tokenImple.parseJWT(token);
		
		userRepository.updateVerify(id);
		return false;
		
	}
	
}
