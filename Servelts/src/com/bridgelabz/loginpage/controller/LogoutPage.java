package com.bridgelabz.loginpage.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logoutservlet")
public class LogoutPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
// logout the page,invalidating the session and redirecting to login page
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		  session.invalidate();
        response.sendRedirect("LoginPage.html");
     
	}

}
