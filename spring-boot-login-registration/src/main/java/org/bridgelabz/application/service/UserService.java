	package org.bridgelabz.application.service;

import org.bridgelabz.application.model.LoginDTO;
import org.bridgelabz.application.model.UserDTO;

public interface UserService {
	public void save(UserDTO user);
	int checkLoginDetails(LoginDTO loginDTO);
	public boolean verifyuser(String token);
}
