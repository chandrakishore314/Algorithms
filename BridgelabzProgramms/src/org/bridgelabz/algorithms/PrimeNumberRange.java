package org.bridgelabz.algorithms;

import java.util.ArrayList;
import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class PrimeNumberRange {

	public static void main(String[] args) {
		ArrayList<Integer> primenumbersList = new ArrayList<Integer>();
		System.out.println("enter the Range you want");
		int num = InputScanner.getInt();
		primenumbersList = Utility.PrimeNumbers(num);
		Utility.displayPrimeNumber(primenumbersList);
		Utility.displayAnagrams(primenumbersList);
		
	}
}
