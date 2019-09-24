package org.bridgelabz.fundoonotes.service;

import java.util.List;

import org.bridgelabz.fundoonotes.model.LoginDTO;
import org.bridgelabz.fundoonotes.model.User;
import org.bridgelabz.fundoonotes.model.UserDTO;

public interface UserService {
	public Boolean userRegistration(UserDTO user);

	int checkLoginDetails(LoginDTO loginDTO);

	public boolean verifyuser(String token);

	public boolean verifyemail(String username);

	public void updateUserPassword(String token, String password);

	public List<User> getUserData(String email);
}
