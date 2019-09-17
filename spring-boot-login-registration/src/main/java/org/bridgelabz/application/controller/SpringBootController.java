package org.bridgelabz.application.controller;

import org.bridgelabz.application.model.LoginDTO;
import org.bridgelabz.application.model.UserDTO;
import org.bridgelabz.application.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	@Autowired
	UserService userService;
	
	Logger logger = Logger.getLogger("myLogger");

// To send the user details to the service class to save the data in the DATABASE
	@PostMapping("/registration")
	public UserDTO registerUser(@RequestBody UserDTO user) {
		logger.info("entered into registration controller");
		userService.save(user);
		return user;
	}

// To send the loginDTO details to the service class to check the login details in the DATABASE
	@PostMapping("/login")
	public String loginUser(@RequestBody LoginDTO loginDTO) {
		int count = userService.checkLoginDetails(loginDTO);
		logger.info("entered into login  controller");
		if (count > 0) {
			return "login sucessful";
		} else {
			return "wrong credentials";
		}
	}
	
	
	
	
	
}
