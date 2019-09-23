//Package name 
package org.bridgelabz.fundoonotes.controller;

import java.util.List;

import org.bridgelabz.fundoonotes.model.LoginDTO;
import org.bridgelabz.fundoonotes.model.User;
import org.bridgelabz.fundoonotes.model.UserDTO;
import org.bridgelabz.fundoonotes.response.Response;
import org.bridgelabz.fundoonotes.service.UserService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Add Swagger 2
//@RequestMapping("/user") add base url
@RestController
@RequestMapping("/user")
public class SpringBootController {
	@Autowired
	private UserService userService;

	private static final Logger LOGGER = Logger.getLogger(SpringBootController.class.getName());

// To send the user details to the service class to save the data in the DATABASE
	//@Cacheable(value="register" ,key="#id")
	@PostMapping("/registration")
	public ResponseEntity<Response> registerUser(@RequestBody UserDTO user) {
		LOGGER.info("entered into registration controller");
		boolean isUserPrensent = userService.userRegistration(user);
		if (isUserPrensent) {
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(new Response("registration sucessful", HttpStatus.CREATED.value()));
		} else {
			return ResponseEntity.status(HttpStatus.CREATED)
					.body(new Response("User already present  ", HttpStatus.CREATED.value()));
		}
	}

// To send the loginDTO details to the service class to check the login details in the DATABASE
	@PostMapping("/login")
	public ResponseEntity<Response> loginUser(@RequestBody LoginDTO loginDTO) {
		int count = userService.checkLoginDetails(loginDTO);
		LOGGER.info("entered into login  controller");
		if (count > 0) {
			return ResponseEntity.status(HttpStatus.OK).body(new Response("login sucessful", HttpStatus.OK.value()));
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
					.body(new Response("registration sucessful", HttpStatus.BAD_REQUEST.value()));
		}
	}

//To verify the email 	
	@GetMapping("/verify")
	public ResponseEntity<Response> verifyUser(@RequestParam String token) {
		System.out.println("enterd in to conotroller");
		userService.verifyuser(token);
		return ResponseEntity.status(HttpStatus.ACCEPTED)
				.body(new Response(" verified the email in the DataBase", HttpStatus.ACCEPTED.value()));
	}

//To send the token to email for the forgot password.
	@GetMapping("/forgotpassword")
	public ResponseEntity<Response> forgotpassword(@RequestParam String email) {
		userService.verifyemail(email);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new Response("mail sent to the email", HttpStatus.CREATED.value()));

	}

	// To update the forgot password.
	@GetMapping("/update")
	public ResponseEntity<Response> updatePassword(@RequestParam String token, @RequestParam String password) {
		userService.updateUserPassword(token, password);
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(new Response("updated in the database", HttpStatus.CREATED.value()));
	}
	@Cacheable(value="user" ,key="#email")
	@GetMapping("/getdata")
	public List<User> getUserDetails(@RequestParam String email) {
		List<User> user=userService.getUserData(email);
		return user;
	}
	
	

}
