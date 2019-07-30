package com.bridgelabz.json;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
	static String str = "Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter name");
		String name = scanner.nextLine();
		System.out.println("enter full name");
		String fullname = scanner.nextLine();
		System.out.println("enter mobile number");
		String phnum = scanner.nextLine();
		System.out.println("enter date");
		String date = scanner.nextLine();

	changeName("name",name);
	changeName("<<full name>>",fullname);
	changeName("xxxxxxxxxx",phnum);
	String changed=changeName("01/01/2016",date);
	
	System.out.println(changed);
	

	}

	private static String changeName(String name, String name2) {
		Pattern pattern = Pattern.compile(name);
		Matcher m = pattern.matcher(str);
		str = m.replaceFirst(name2);
		return str;
	}

}
