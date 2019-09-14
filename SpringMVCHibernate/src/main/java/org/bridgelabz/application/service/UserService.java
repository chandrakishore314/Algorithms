package org.bridgelabz.application.service;

import org.bridgelabz.application.model.Login;
import org.bridgelabz.application.model.Student;

public interface UserService {

	int doLogin(Login login);
	int doregistration(Student student);
}
