package org.bridgelabz.designpattern.jdbccode;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DatabaseConnector extends HttpServlet {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/student";
	   static final String USER = "admin";
	   static final String PASS = "Kishore@314";
	   

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 java.sql.Connection conn = null;
		   java.sql.Statement stmt = null;
		   
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		int age =Integer.parseInt(request.getParameter("Age"));
		String gender = request.getParameter("gender");
		String collegename = request.getParameter("collegename");
		   
		   
		   try {
			Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection(DB_URL,USER,PASS);
			   stmt = conn.createStatement();
			   
			   String sql = "INSERT INTO student_tbl " +
	                   "VALUES (userName,password,age,gender,collegename)";
	      stmt.executeUpdate(sql);
			   
			   
			   
			   
			   
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		  
		   

		
		
		
		
		
		
	response.sendRedirect("LoginPage.html");
		
		
		
		
		
		
		System.out.println("your details");
		System.out.println(userName+" "+password +" "+age+" "+gender+" "+collegename);
		
	}
}