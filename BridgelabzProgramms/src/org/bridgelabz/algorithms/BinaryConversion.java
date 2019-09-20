package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

/**
 * @author Chandra Kishore
 **/
public class BinaryConversion {

	public static void main(String[] args) {
		System.out.println("Enter number");
		int num = InputScanner.getInt();
		int[] binaryArray = Utility.toBinary(num);

		System.out.println("binary num as");
		for (int j = 7; j >= 0; j--) {
			System.out.print(binaryArray[j]);
		}
		System.out.println("\n\nnumber after swap" + Utility.swap(binaryArray));
	}

}
