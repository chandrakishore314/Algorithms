package org.bridgelabz.oops.regularexpresion;

/**
 * Date :05/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bridgelabz.programms.utility.InputScanner;

public class RegularExpressions {
	static String str = "Hello <<name>>, We have your full name as <<full name>> in our system.\n"
			+ " your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification \n"
			+ "Thank you BridgeLabz \n 01/01/2016.";

	public static void main(String[] args) {
		System.out.println("enter name");
		String name = InputScanner.getString();
		System.out.println("enter full name");
		String fullname = InputScanner.getString();
		int length;
		String phnum;
		do {
			System.out.println("enter 10 digit mobile number");
			phnum = InputScanner.getString();
			length = phnum.length();
		} while (length != 10);

		changeName("name", name);
		changeName("<<full name>>", fullname);
		changeName("xxxxxxxxxx", phnum);
		String changed = changeName("01/01/2016", new Date().toString());
		System.out.println(changed);
	}

	private static String changeName(String name, String name2) {
		Pattern pattern = Pattern.compile(name);
		Matcher m = pattern.matcher(str);
		str = m.replaceFirst(name2);
		return str;
	}

}
