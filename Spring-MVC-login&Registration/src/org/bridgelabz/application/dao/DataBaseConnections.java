package org.bridgelabz.application.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.bridgelabz.application.model.Student;
import org.bridgelabz.application.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
public class DataBaseConnections {
	int count =0;
	 private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		  this.jdbcTemplate = jdbcTemplate;
		  }
	//To save the employee registration details in the DataBase
	public int saveEmployee(Student e) {
		String password=e.getPassword();
		String epass=Utility.encryptPasswors(password);
 String query="insert into student_tbl values('"+e.getUserName()+"','"+epass+"','"+e.getAge()+"','"+e.getGender()+"','"+e.getEmail()+"','"+e.getPhnum()+"')";
		   return jdbcTemplate.update(query); 
	}
	
	//To fetch the data from the DataBase
	public List<Student> loginUser(Student student) {
	    String sql = "select * from student_tbl";
   System.out.println(sql);
    return jdbcTemplate.query(sql,new RowMapper<Student>(){  
    @Override  
    public Student mapRow(ResultSet rs, int rownumber) throws  SQLException    {  
         Student e=new Student();  
e.setUserName(rs.getString(1));         
 e.setPassword(rs.getString(2));
          return e;  
        }  
    });  
    }
	public void saveEmployee(String resetemail, String resetpass) {
String query="UPDATE student_tbl SET password ='"+resetpass+"'where email='"+resetemail+"'";
System.out.println(resetemail+" resetemail");
jdbcTemplate.update(query); 
	}
	 }
	
	
	
	
