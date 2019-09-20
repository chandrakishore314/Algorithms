package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class temparatureConversion {
	public static void main(String[] args) {
		
		System.out.println("celsius:c or farenheat:f conversion");
		String ch=InputScanner.getString();
		Utility.getTemparatureConverter(ch);
		
			}

}
