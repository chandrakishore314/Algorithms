package org.bridgelabz.application.service;

import java.util.List;
import javax.transaction.Transactional;
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
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepository;
	@Autowired
	UserConfiguration userConfiguration;
	@Autowired
    private JavaMailSender javaMailSender;
	
//To save the user details in the DATABASE
	@Transactional
	public void save(UserDTO userdto) {
		System.out.println(" entered into registration service ");
		 ModelMapper modelMapper =userConfiguration.getModelMapper();
		 User user1 = modelMapper.map(userdto, User.class);
		 user1.setPassword(userConfiguration.bCryptPasswordEncoder().encode(user1.getPassword()));
		 userRepository.save(user1);
		 SimpleMailMessage msg = new SimpleMailMessage();
	        msg.setTo("chandrakishore314@gmail.com");

	        msg.setSubject("Testing from Spring Boot");
	        msg.setText("Hello World \n Spring Boot Email");

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
			if(loginDTO.getEmail().equals(user.getEmail()) && encoder.matches(loginDTO.getPassword(), user.getPassword())) {
				count=1;
			}
		}
		return count;
	}

}
