package com.bridgelabz.loginpage.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.loginpage.dao.DataBaseConnections;

public class LoginController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int count=0;
		DataBaseConnections dbconnection=new DataBaseConnections();
		count=dbconnection.checkValues(request,response);
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		session.invalidate();
		if(count>0) {
			out.print("welcome");
		}
		else {
			response.sendRedirect("credentialsrror.html");
		}
	}
}
