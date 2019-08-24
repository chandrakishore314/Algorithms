package org.bridgelabz.lists.model;

import java.util.Iterator;
import java.util.List;

public class Person {
	
	
	Person(){
		
	}
	private String name;
private String email;
private String college;
private  List<String> stringList;
public Person(String name, String email, String college, List<String> stringList) {
	this.name = name;
	this.email = email;
	this.college = college;
	this.stringList = stringList;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public List<String> getStringList() {
	return stringList;
}
public void setStringList(List<String> stringList) {
	this.stringList = stringList;
}

public void displayInfo(){  
	
	System.out.println(name);
	System.out.println(email);
	System.out.println(college);
    Iterator<String> itr=stringList.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
    }  
}


}
