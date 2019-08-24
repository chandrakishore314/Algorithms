package org.bridgelabz.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataBaseMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("org/bridgelabz/springjdbc/applicationContext.xml"); 
		context.getBean("edao");
		
		EmployeeDao dao=(EmployeeDao)context.getBean("edao");  
	    int status=dao.saveEmployee(new Employee("ram","Amit","hjjj"));  
	    System.out.println(status);  
	}

}
