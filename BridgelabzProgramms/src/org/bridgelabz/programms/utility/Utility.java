package org.bridgelabz.programms.utility;

import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;

public class Utility {

	public static ObjectMapper getObjectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper;
	}

	public static void sortString(String str) {
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i + 1; j < charArray.length; j++) {
				if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
					swapChars(i, j, charArray);
				}
			}
		}
	}

	public static void swapChars(int i, int j, char[] charArray) {
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
	}

	public static boolean checkAnagrams(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		int num = 0;
		if (str1.length() == str2.length()) {
			for (int i = 0; i < str1.length(); i++) {
				for (int j = 0; j < str2.length(); j++) {
					if (s1[i] == s2[j]) {
						num++;
					}
				}
			}
		}
		if (num == str1.length()) {
			return true;
		}
		return false;
	}

	// To swap the Binary Number from 0-3 to 4-7
	public static int swap(int[] br) {
		int num = 0;

		int ar[] = new int[8];
		for (int i = 0, j = 4; i < 4; i++, j++) {
			ar[j] = br[i];
		}
		for (int i = 4, j = 0; i < 8; i++, j++) {
			ar[j] = br[i];
		}
		System.out.println();
		for (int k = 0; k < 8; k++) {
			System.out.print(br[k]);
		}
		for (int j = 0; j < 8; j++) {
			if (ar[j] > 0)
				num += Math.pow(2, j);
		}
		return num;
	}

	// To convert into Binary Digits
	public static int[] toBinary(int n) {
		int[] bin = new int[8];
		int i = 0;
		while (n > 0) {
			bin[i++] = n % 2;
			n = n / 2;
		}
		return bin;
	}

	// calculate Day based on Date,Month and Years
	public static int day(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;
		return d0;

	}

	// Bubble sort of Numbers
	public static int[] sort(int[] array) {
		int n = array.length, temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
 // To read the Array of Elements from the console 
	public static int[] getArrayElement(int limit) {
		int array[] = new int[limit];
		for (int i = 0; i < limit; i++) {
			array[i] = InputScanner.getInt();
		}
		return array;
	}

	public static void displayArrayElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// To sort the array using mergesort
	public static void mergeSort(int[] array, int beg, int end) {
		if (beg < end) {
			int mid = (beg + end) / 2;
			mergeSort(array, beg, mid);
			mergeSort(array, mid + 1, end);
			merge(array, beg, mid, end);
		}

	}

	// To sort the array using merge sort
	public static void merge(int[] array, int beg, int mid, int end) {
		int l, r;
		l = mid - beg + 1;
		r = end - mid;
		int leftArr[] = new int[l];
		int rightArr[] = new int[r];
		for (int i = 0; i < l; i++) {
			leftArr[i] = array[beg + i];
		}
		for (int j = 0; j < r; j++) {
			rightArr[j] = array[mid + 1 + j];
		}

		int i = 0, j = 0;
		int k = beg;
		while (i < l && j < r) {
			if (leftArr[i] < rightArr[j]) {

				array[k] = leftArr[i];
				i++;
			} else {
				array[k] = rightArr[j];
				j++;
			}
			k++;
		}

		while (i < l) {
			array[k] = leftArr[i];
			k++;
			i++;
		}
		while (j < r) {
			array[k] = rightArr[j];
			k++;
			j++;
		}
	}

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
	public static void sort(String[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			String key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j].compareTo(key) > 0) {
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

	//To return the list of prime numbers with in the range
	public static ArrayList<Integer> PrimeNumbers(int range) {
		ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
		for (int i = 2; i < range; i++) {
			int num = 0;
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					num++;
				}
			}
			if (num == 2) {
				primeNumbersList.add(i);

			}
		}
		return primeNumbersList;
	}
	
	// To check the number is Anagram or Not
	public static int Anagram(int num) {
		int reversed = 0;
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num /= 10;

		}
		return reversed;
	}

	// To check the number is polindrome or Not
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

	// To diaplay the day of the Date
	public static String displayDay(int d0) {
		String str = null;
		switch (d0) {
		case 0:
			str = "sunday";
			break;
		case 1:
			str = "monday";
			break;
		case 2:
			str = "tueday";
			break;
		case 3:
			str = "wedday";
			break;
		case 4:
			str = "thurday";
			break;
		case 5:
			str = "friday";
			break;
		case 6:
			str = "satday";
			break;
		}
		return str;
	}

	// To divide the Amount in Notes and display
	public static void displayAmountInNotes(int amount) {
		int notes[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int count[] = new int[8];
		for (int i = 0; i < 8; i++) {
			if (amount >= notes[i]) {
				count[i] = amount / notes[i];
				amount = amount - (count[i] * notes[i]);
			}

		}
		for (int i = 0; i < 8; i++) {

			System.out.println(notes[i] + "are " + count[i]);
		}

	}

	// To calculate the monthly intrest,rate of intrest
	public static void calculateIntrest(double p, double y, double rt) {
		double r = (rt / 100) / 12;
		double n = 12 * y;
		double payment = (p * r) / (1 - Math.pow(1 + r, -n));
		double interest = payment * n - p;

		System.out.println("Monthly payments = " + payment);
		System.out.println("Total interest   = " + interest);
	}
     //To display the prime Numbers 
	public static void displayPrimeNumber(ArrayList<Integer> primenumbersList) {
		System.out.println("printing the prime numbers ");
		for (Integer num1 : primenumbersList) {
			System.out.println(num1);
		}
		
	}

	//To display the numbers which are both prime and anagram numbers
	public static void displayAnagrams(ArrayList<Integer> primenumbersList) {
		
		boolean flag1 = false, flag2;
		System.out.println("printing the primes are anagram & polindrome ");
		int rev;
		for (int i = 1; i < primenumbersList.size(); i++) {
			int num1 = primenumbersList.get(i).byteValue();
			rev = Utility.Anagram(num1);
			if (num1 == rev) {
				flag1 = true;
			}
			flag2 = Utility.Polindrome(num1, primenumbersList);
			if (flag1 == true && flag2 == true) {
				System.out.println(num1);

			}
		}
	}

	public static void getTemparatureConverter(String ch) {
		switch(ch) {
		case "c":
			System.out.println("ente celsius temp");
			int c=InputScanner.getInt();
			double f=(c*9/5)+32;
			System.out.println("farenheat value is "+f);
			break;
		case "f":
			int f1=InputScanner.getInt();
			double c1=(f1-32)*5/9;
			System.out.println("celsius values are"+ c1);
			break;	
		default: 
		    System.out.println("pls enter c or f conversions"); 
		}
		
	}

}
