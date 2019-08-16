package com.bridgelabz.designpattern.prototype;

import java.util.Scanner;

public class ProtoType {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
Employee employee=new Employee();
	 String ename=scanner.next();
	 employee.setEname(ename);
	 String name=scanner.next();
	 employee.setEname(ename);
	 int age=scanner.nextInt();
	 employee.setAge(age);
	 int eid=scanner.nextInt();
	 employee.setEid(eid);
	 
	 System.out.println(employee);
	 Employee employee1=(Employee)employee.getClone();
	 
		System.out.println(employee1);
		employee1.setEid(4);
		System.out.println(employee1);
	}

}
