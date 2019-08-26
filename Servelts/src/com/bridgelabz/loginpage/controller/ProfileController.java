package com.bridgelabz.loginpage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class ProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   // To display the user profile after login 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String cookiename = null;
		 response.setContentType("text/html"); 
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++) { 
            Cookie cookie1 = cookies[i];
            if(cookie1.getName().equalsIgnoreCase("username")) {
            cookiename=cookie1.getValue();
            	out.print(cookiename+"name aas cookie");
            }
          
            }
		
		HttpSession session=request.getSession(false); 
		
		if(session!=null && cookiename.equals((String)session.getAttribute("userName"))) {
		request.getRequestDispatcher("commonpage.html").include(request, response); 
		String userName=(String)session.getAttribute("userName");
		String phnum=(String)session.getAttribute("phnumber");
		String email=(String)session.getAttribute("email");
		out.print("Hello,  Welcome to profile  !!  "+userName+"<br>"); 
		out.print("phone number"+phnum+"<br>");
		out.print("email    "+email+"<br>");
		 
		}else {
	        response.sendRedirect("LoginPage.html");
		}
	
	}

}
