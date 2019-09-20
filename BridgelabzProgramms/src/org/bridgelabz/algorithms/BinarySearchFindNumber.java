package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;

public class BinarySearchFindNumber {

	public static void main(String[] args) {
		int key = Integer.parseInt(args[0]);
		int low = 0;
		int high = (int) Math.pow(2, key);
		System.out.println(high);
		while (low <= high) {
			int mid = (low + high) / 2;
			if (low == high) {
				System.out.println("require number is " + high);
				break;
			}
			System.out.println("false for " + low + " to " + (mid) + "&& true for" + (mid + 1) + "to" + high);
			boolean b = InputScanner.getBoolean();
			if (b) {
				low = mid + 1;
			} else {
				high = mid;
			}

		}
	}
}
