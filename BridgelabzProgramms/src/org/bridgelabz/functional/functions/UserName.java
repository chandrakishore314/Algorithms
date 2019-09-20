package org.bridgelabz.functional.functions;

import org.bridgelabz.programms.utility.InputScanner;

public class UserName {

	public static void main(String[] args) {

		String str = "Hello UserName, How are you?", UserName;
		System.out.println("enter username");
		UserName = InputScanner.getString();
		System.out.println(str.replaceFirst("UserName", UserName));

	}

}
