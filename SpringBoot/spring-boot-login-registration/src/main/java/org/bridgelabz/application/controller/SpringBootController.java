package org.bridgelabz.application.controller;

import org.bridgelabz.application.model.LoginDTO;
import org.bridgelabz.application.model.User;
import org.bridgelabz.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	@Autowired
	UserService userService;

// To send the user details to the service class to save the data in the DATABASE
	@PostMapping("/registration")
	User registerUser(@RequestBody User user) {
System.out.println(" entered into registration controller ");
		 userService.save(user);
		return user;
	}

// To send the loginDTO details to the service class to check the login details in the DATABASE
	@PostMapping("/login")
	String loginUser(@RequestBody LoginDTO loginDTO) {
		int count = userService.checkLoginDetails(loginDTO);
		if (count > 0) {
			return "login sucessful";
		} else {
			return "wrong credentials";
		}
	}

}
