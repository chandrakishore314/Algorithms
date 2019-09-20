package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		System.out.println("enter the limit of array ");
		int length=InputScanner.getInt();
		int array[]=Utility.getArrayElement(length);
		Utility.mergeSort(array,0,length-1);
		System.out.println("after merge sorting");
		Utility.displayArrayElements(array);
		

	}

}