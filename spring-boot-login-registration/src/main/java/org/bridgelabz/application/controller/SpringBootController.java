package org.bridgelabz.application.controller;

import org.bridgelabz.application.model.LoginDTO;
import org.bridgelabz.application.model.UserDTO;
import org.bridgelabz.application.response.Response;
import org.bridgelabz.application.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SpringBootController {
	@Autowired
	private UserService userService;
	
	Logger logger = Logger.getLogger("myLogger");

// To send the user details to the service class to save the data in the DATABASE
	@PostMapping("/registration")
	public ResponseEntity<Response> registerUser(@RequestBody UserDTO user) {
		logger.info("entered into registration controller");
		userService.save(user);
		Response response=new Response("registration sucessful",500);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}

// To send the loginDTO details to the service class to check the login details in the DATABASE
	@PostMapping("/login")
	public ResponseEntity<Response> loginUser(@RequestBody LoginDTO loginDTO) {
		int count = userService.checkLoginDetails(loginDTO);
		logger.info("entered into login  controller");
		if (count > 0) {
			
			Response response =new Response("login sucess",500);
			return new ResponseEntity<>(response,HttpStatus.OK);
			
		} else {
         Response response =new Response("login fail",404);
			return new ResponseEntity<>(response,HttpStatus.OK);
			
		}
	}
	
//To verify the email 	
	@GetMapping("/verify")
	public ResponseEntity<Response> verifyUser(@RequestParam String token){
		userService.verifyuser(token);
		
		Response response =new Response("sucessfully verified",500);
		return new ResponseEntity<>(response,HttpStatus.OK);
		
	}
	
	
	
	
}
