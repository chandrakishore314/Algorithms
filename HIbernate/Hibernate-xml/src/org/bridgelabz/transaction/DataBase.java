package org.bridgelabz.transaction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class DataBase {
	 static final String DB_URL = " jdbc:mysql://localhost:3036/student";
	   static final String USER = "admin";
	   static final String PASS = "Kishore@314";
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "INSERT INTO student_tbl VALUES (?,?,?,?,?);";
		 try {
				Class.forName("com.mysql.jdbc.Driver");
			 conn = DriverManager.getConnection(DB_URL,USER,PASS);
			 stmt = conn.prepareStatement(sql);
			 stmt.setString(1, "kishorre");
			 stmt.setString(2, "dsfdf");
			 System.out.println("passwore seted");
			  stmt.setInt(3, 3);
			  System.out.println("age seted");
			  stmt.setString(4,"male");
			  stmt.setString(5, "sdgsd");
	      stmt.executeUpdate();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
}
