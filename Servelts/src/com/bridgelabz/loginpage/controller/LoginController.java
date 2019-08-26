package com.bridgelabz.loginpage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.loginpage.dao.DataBaseConnections;

public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	//Login values sending to the database and displaying the result based on credentials
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int count=0;
		DataBaseConnections dbconnection=new DataBaseConnections();
		count=dbconnection.checkValues(request,response);
	    response.setContentType("text/html");  
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false);  
		if(count>0) {
				String userName=(String)session.getAttribute("userName");
				System.out.println(userName+"in the login controller");
				 request.getRequestDispatcher("commonpage.html").include(request, response); 
				 RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");  
			        rd.include(request, response);
				out.print("Hello, "+userName+" Welcome !!"); 
				Cookie ck=new Cookie("name",userName);  
	            response.addCookie(ck);  
		}
		else {
			out.print("	Sorry UserName or Password Error!");  
	        RequestDispatcher rd=request.getRequestDispatcher("/LoginPage.html");  
	        rd.include(request, response); 
		}
	}
}
