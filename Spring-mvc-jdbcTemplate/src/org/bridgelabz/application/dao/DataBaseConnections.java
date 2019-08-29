package org.bridgelabz.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.bridgelabz.application.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class DataBaseConnections {
	int count =0;
	@Autowired
	 private JdbcTemplate jdbcTemplate;
	 public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
		    this.jdbcTemplate = jdbcTemplate;  
		} 
	public int saveEmployee(Student e) {
		
		 String query="insert into student_tbl values('"+e.getUserName()+"','"+e.getPassword()+"','"+e.getAge()+"','"+e.getGender()+"','"+e.getEmail()+"','"+e.getPhnum()+"')";
		 
		   return jdbcTemplate.update(query); 
	}
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

	    }
	
	
	
	
