package com.bridgelabz.loginpage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/WelcomePage")
public class WelcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// accpet the registration request data,send it to the database to store
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false); 
		PrintWriter out=response.getWriter();
		if(session!=null ) {
		request.getRequestDispatcher("commonpage.html").include(request, response);  
		String userName=(String)session.getAttribute("userName");
		out.print("Hello, "+userName+" Welcome !!");
		}else {
			 response.sendRedirect("LoginPage.html"); 
		}
	}

}
