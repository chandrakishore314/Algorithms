package org.Bridgelbz.programms.Utility.algorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilityAlgorithms {
// binary search of Integers
	public static int binarySearchOfInterger(int[] arr, int i, int length, int key) {
		int mid = 0;
		if (length >= i) {
			mid = i + (length - i) / 2;

			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearchOfInterger(arr, i, mid, key);
			} else {
				return binarySearchOfInterger(arr, mid + 1, length, key);
			}
		}
		return -1;

	}
	// insertion sorting of strings
	public void sort(String[] arr) 
    { 
        int n = arr.length; 
        for (int i = 1; i < n; ++i) { 
            String key = arr[i]; 
            int j = i - 1;
       
            while (j >= 0 && arr[j].compareTo(key)>0) { 
                arr[j + 1] = arr[j]; 
                
                
                j = j - 1; 
                
            } 
         
            arr[j + 1] = key; 
        } 
    } 

	// bubble sort of Integers
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
		
					arr[j + 1] = temp;
				}
	}

	public static ArrayList<Integer> PrimeNumbers(int range) {
		ArrayList<Integer> al = new <Integer>ArrayList();
		int k = 0;
		for (int i = 2; i < range; i++) {
			int num = 0;
			for (int j = i; j >= 1; j--) {

				if (i % j == 0) {
					num++;
				}

			}

			if (num == 2) {
				al.add(i);

			}
		}
		return al;
	}

	public static int Anagram(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;

		}
		return reversed;
	}

	public static boolean Polindrome(int num, ArrayList<Integer> al) {
		int reversed = 0;
		boolean reve = false;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;
		}
		reve = al.contains(reversed);
		return reve;
	}

	// insertion sort of Integers
	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > arr[j + 1]) {
				arr[j + 1] = arr[j];

				j = j - 1;

			}

			arr[j + 1] = key;
		}

	}
}
