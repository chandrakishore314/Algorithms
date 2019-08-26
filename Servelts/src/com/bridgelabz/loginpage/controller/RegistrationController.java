package com.bridgelabz.loginpage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.loginpage.dao.DataBaseConnections;
// accpet the registration request data,send it to the database to store
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int count = 0;
		PrintWriter out = response.getWriter();
		DataBaseConnections dbconnection = new DataBaseConnections();
		count = dbconnection.insert(request);
		if (count > 0) {
			response.sendRedirect("LoginPage.html");
		} else {
			out.print("pls enter details correct format");
			RequestDispatcher rd = request.getRequestDispatcher("/RegistrationPage.html");
			rd.include(request, response);
		}

	}
}





























