	package org.bridgelabz.application.service;

import org.bridgelabz.application.model.LoginDTO;
import org.bridgelabz.application.model.User;

public interface UserService {
	public void save(User user);
	int checkLoginDetails(LoginDTO loginDTO);
}
