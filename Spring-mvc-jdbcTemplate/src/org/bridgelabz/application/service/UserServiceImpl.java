package org.bridgelabz.application.service;

import org.bridgelabz.application.dao.DataBaseConnections;
import org.bridgelabz.application.model.Login;
import org.bridgelabz.application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {
	@Autowired
	DataBaseConnections eDAO;
	
	public int doRegistration(Student student) {
		System.out.println(" entered into service layer");
		
	return eDAO.saveEmployee(student);
	}
	public int doLogin(Login login){
		System.out.println(" entered into service layer"+eDAO);
		
		int  data=eDAO.loginUser(login);
	return data;
	}
	public void doUpdate(String resetemail,String encryptpass) {
		System.out.println(" entered into service layer");
		eDAO.saveEmployee(resetemail,encryptpass);
	}
}
