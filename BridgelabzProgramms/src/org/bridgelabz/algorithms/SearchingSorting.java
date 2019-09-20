package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class SearchingSorting {

	public static void main(String[] args) {
		System.out.println("enter length and integers");
		int length = InputScanner.getInt();
		int ar[] = new int[length];
		for (int start = 0; start < length; start++) {
			ar[start] = InputScanner.getInt();
		}
		// performing bubble sort on intergers
		long StartTime = System.currentTimeMillis();
		System.out.println(StartTime + " start time");
		Utility.bubbleSort(ar);
		long EndTime = System.currentTimeMillis();
		long bubbleSortOfIntergerTotalTime = (EndTime - StartTime) / 1000;
		System.out.println("bubble sort timetaken in milliseconds " + bubbleSortOfIntergerTotalTime);

		// performing insertion sort intergers
		System.out.println("enter length and integers");
		length = InputScanner.getInt();
		int arr[] = new int[length];
		for (int start = 0; start < length; start++) {
			arr[start] = InputScanner.getInt();
		}
		StartTime = System.currentTimeMillis();
		Utility.insertionSort(arr);
		EndTime = System.currentTimeMillis();
		long insertionSortOfIntergerTotalTime = (EndTime - StartTime) / 1000;
		System.out.println("insertion  sort timetaken " + insertionSortOfIntergerTotalTime);

		// performing binary search intergers

		System.out.println("enter number u want to search");
		int key = InputScanner.getInt();
		int index;
		StartTime = System.nanoTime();
		index = Utility.binarySearchOfInterger(ar, 0, length - 1, key);
		EndTime = System.nanoTime();
		long binarySearchOfIntergerTotalTime = (EndTime - StartTime) / 1000;
		System.out.println("binarySearchOfIntergerTotalTime" + binarySearchOfIntergerTotalTime + "milliseconds");
		if (index == -1) {
			System.out.println("element not found in the array");
		} else {
			System.out.println("element found at" + (index + 1) + "position");
		}
	}

}
