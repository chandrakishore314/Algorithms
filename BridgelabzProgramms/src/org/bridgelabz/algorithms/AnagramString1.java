package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class AnagramString1 {
	public static void main(String[] args) {
		System.out.println("enter string one");
		String str1 = InputScanner.getString();

		System.out.println("enter string2");
		String str2 = InputScanner.getString();

		if (Utility.checkAnagrams(str1, str2))
			System.out.println("Anagram strings");
		else
			System.out.println("Not Anagram strings");
	}
}
