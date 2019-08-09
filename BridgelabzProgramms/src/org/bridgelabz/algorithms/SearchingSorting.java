package org.bridgelabz.algorithms;
import java.util.Scanner;

import org.bridgelabz.programms.utility.algorithms.UtilityAlgorithms;
public class SearchingSorting {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter length and integers");
		int length = scanner.nextInt();
		int ar[] = new int[length];
		for (int start = 0; start < length; start++) {
			ar[start] = scanner.nextInt();
		}
		//performing bubble sort on intergers
		long StartTime=System.currentTimeMillis();
		System.out.println(StartTime+" start time");
		UtilityAlgorithms.bubbleSort(ar);
		long EndTime=System.currentTimeMillis();
		long bubbleSortOfIntergerTotalTime=(EndTime-StartTime)/1000000;
		System.out.println("bubble sort timetaken in milliseconds "+bubbleSortOfIntergerTotalTime);
		
		//performing insertion sort  intergers
		System.out.println("enter length and integers");
		 length = scanner.nextInt();
		int arr[] = new int[length];
		for (int start = 0; start < length; start++) {
			arr[start] = scanner.nextInt();
		}
		 StartTime=System.currentTimeMillis();
		UtilityAlgorithms.insertionSort(arr);
	    EndTime=System.currentTimeMillis();
		long insertionSortOfIntergerTotalTime=(EndTime-StartTime)/1000000;
		System.out.println("insertion  sort timetaken "+insertionSortOfIntergerTotalTime);
		
		//performing binary search  intergers
		
		System.out.println("enter number u want to search");
		int key=scanner.nextInt();
		int index;
		 StartTime=System.nanoTime();
		index= UtilityAlgorithms.binarySearchOfInterger(ar,0,length-1,key);
		EndTime=System.nanoTime();
		long binarySearchOfIntergerTotalTime=(EndTime-StartTime)/1000000;
		 System.out.println("binarySearchOfIntergerTotalTime"+binarySearchOfIntergerTotalTime+"milliseconds");
           if(index==-1) {
        	   System.out.println("element not found in the array");
           }else {
        	   System.out.println("element found at"+(index+1)+"position");
           }
           
	}


}
