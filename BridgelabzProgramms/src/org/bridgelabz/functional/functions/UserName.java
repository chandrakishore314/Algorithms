package org.bridgelabz.functional.functions;

import org.bridgelabz.functional.utility.Utility;

public class UserName {
	
	public static void main(String[] args) {

String str="Hello UserName, How are you?",UserName;
System.out.println("enter username");
UserName=Utility.getScanner().nextLine();
System.out.println(str.replaceFirst("UserName", UserName));

	}

}
