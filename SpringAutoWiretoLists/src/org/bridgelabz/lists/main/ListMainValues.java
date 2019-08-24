package org.bridgelabz.lists.main;

import org.bridgelabz.lists.model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListMainValues {

	public static void main(String[] args) {
ApplicationContext application=new ClassPathXmlApplicationContext("org/bridgelabz/lists/model/applicationContext.xml");
Person p=(Person) application.getBean("person");
p.displayInfo();
	}

}
