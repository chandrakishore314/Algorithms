package com.bridgelabz.loginpage.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataBaseConnections {
	
int count=0;


//To insert values into DataBase
	public int insert(HttpServletRequest request) {
		System.out.println("entered into DataBAse");
		   
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				int age =Integer.parseInt(request.getParameter("Age"));
				String gender = request.getParameter("gender");
				String collegename = request.getParameter("collegename");
		
				 String sql = "INSERT INTO student_tbl VALUES (?,?,?,?,?);";
					
				 try {
					 Class.forName("com.mysql.jdbc.Driver");
					
					 Connection con=DriverManager.getConnection(  
							 "jdbc:mysql://localhost:3306/student?useSSL=true","admin","Kishore@314");  
					 PreparedStatement stmt = con.prepareStatement(sql);
					 stmt.setString(1, userName);
					 stmt.setString(2, password);
					  stmt.setInt(3, age);
					  stmt.setString(4, gender);
					  stmt.setString(5, collegename);
			    count=  stmt.executeUpdate();
			      con.close();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
		
		
		return count;
	}


	public int checkValues(HttpServletRequest request, HttpServletResponse response) {
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String query = "SELECT * FROM student_tbl";
		System.out.println("entered into DataBAse login");
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			
			 Connection con=DriverManager.getConnection(  
					 "jdbc:mysql://localhost:3306/student?useSSL=true","admin","Kishore@314");  
			 Statement st = con.createStatement();
			 ResultSet rs = st.executeQuery(query);
			 while (rs.next())
		      {
				 if(username==rs.getString(1) && password==rs.getString(2) );{
					 return 1;
				 }
		      }
			 
			 con.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return 0;
		
	}

}
