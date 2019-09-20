package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class MaxValueNotes {
// To calculate Amount in Notes
	public static void main(String[] args) {
		System.out.println("enter amount");
		int amount = InputScanner.getInt();
		Utility.displayAmountInNotes(amount);
	}

}
