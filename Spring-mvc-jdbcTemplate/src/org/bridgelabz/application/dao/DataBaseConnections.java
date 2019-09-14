package org.bridgelabz.application.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.bridgelabz.application.model.Login;
import org.bridgelabz.application.model.Student;
import org.bridgelabz.application.utility.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
@Repository
public class DataBaseConnections {
	int count = 0;
	 private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	// To save the employee registration details in the DataBase
	public int saveStudent(Student student) {
		String password = student.getPassword();
		String epass = Utility.encryptPasswors(password);
		String query = "insert into student_tbl values('" + student.getUserName() + "','" + epass + "','" + student.getAge() + "','"
				+ student.getGender() + "','" + student.getEmail() + "','" + student.getPhnum() + "')";
		return jdbcTemplate.update(query);
	}

	// To fetch the data from the DataBase
	public int loginUser(Login login) {
		int count=0;
		String sql="select * from student_tbl";
		System.out.println(sql);
		System.out.println(jdbcTemplate);
		List<Student> demo= jdbcTemplate.query(sql,new RowMapper<Student>(){  
		    @Override  
		    public Student mapRow(ResultSet rs, int rownumber) throws  SQLException    {  
		         Student e=new Student();  
		e.setUserName(rs.getString(1));         
		 e.setPassword(rs.getString(2));
		          return e;  
		        }  
		    });
		if(demo.size()>0) {
			for(Student student:demo) {
				if(student.getUserName().equals(login.getUserName())&&student.getPassword().equals(login.getPassword())){
					count=1;
				}
			}
		}
		return count;
	}
// To update the password in DataBase
	public void saveEmployee(String resetemail, String resetpass) {
		String query = "UPDATE student_tbl SET password ='" + resetpass + "'where email='" + resetemail + "'";
		System.out.println(resetemail + " resetemail");
		jdbcTemplate.update(query);
	}
}
