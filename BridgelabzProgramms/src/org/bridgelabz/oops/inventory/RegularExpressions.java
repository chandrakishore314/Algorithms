/**
 * Date :05/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.inventory;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bridgelabz.programms.utility.Utility;

public class RegularExpressions {
	static String str = "Hello <<name>>, We have your full name as <<full name>> in our system.\n"
			+ " your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification \n"
			+ "Thank you BridgeLabz \n 01/01/2016.";
	public static void main(String[] args) {
		 Scanner scanner =Utility.getScanner();
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
