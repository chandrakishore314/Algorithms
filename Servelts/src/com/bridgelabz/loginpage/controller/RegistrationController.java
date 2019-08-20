package com.bridgelabz.loginpage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginpage.dao.DataBaseConnections;

public class RegistrationController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	int count=0;	
	System.out.println("entered into servlet");
		DataBaseConnections dbconnection=new DataBaseConnections();
		count=dbconnection.insert(request);
		if(count>0) {
			response.sendRedirect("LoginPage.jsp");
		}
		else {
			response.sendRedirect("Error.html");
		}
		
	}
}
