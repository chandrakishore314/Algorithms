package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class Bubblesort {
	public static void main(String[] args) {
		System.out.println("enter limit of array");
		int length = InputScanner.getInt();
		int[] array = Utility.sort(Utility.getArrayElement(length));
		Utility.displayArrayElements(array);
	}
}