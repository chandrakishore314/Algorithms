package org.bridgelabz.springcore.model;

public class Person {
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public void display() {
	System.out.println("hello world   " +name);
}
}