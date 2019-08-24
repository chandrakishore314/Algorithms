package org.bridgelabz.springjdbc;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
	 private JdbcTemplate jdbcTemplate;
	 public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
		    this.jdbcTemplate = jdbcTemplate;  
		} 
	 
	 public int saveEmployee(Employee e){  
		 String query="insert into employee values('"+e.getFirstname()+"','"+e.getMiddlename()+"','"+e.getLastname()+"')";  
		   return jdbcTemplate.update(query);  
		}  

}
