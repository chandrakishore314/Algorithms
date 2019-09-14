package org.bridgelabz.application.service;

import org.bridgelabz.application.model.Login;
import org.bridgelabz.application.model.Student;
import org.bridgelabz.application.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceImpl {
	@Autowired
	UserDAO userDAO;

	public int doLogin(Login login) {
		int  data=userDAO.loginUser(login);
		return data;
	}
	public int doregistration(Student student) {
		int  data=userDAO.saveUser(student);
		return data;
	}
}
