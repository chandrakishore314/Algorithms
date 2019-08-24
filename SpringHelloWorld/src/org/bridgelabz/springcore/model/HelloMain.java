package org.bridgelabz.springcore.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloMain {

	public static void main(String[] args) {
		//Resource resource=new ClassPathResource("org/bridgelabz/springcore/model/applicationContext.xml");  
	    //BeanFactory factory=new XmlBeanFactory(resource);  
	    ApplicationContext factory =   
	            new ClassPathXmlApplicationContext("org/bridgelabz/springcore/model/applicationContext.xml");  
	    Person student=(Person)factory.getBean("personbean");  
	    student.display();  

	}

}
