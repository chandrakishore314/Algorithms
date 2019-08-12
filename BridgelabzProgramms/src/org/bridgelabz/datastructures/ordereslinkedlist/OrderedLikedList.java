package org.bridgelabz.datastructures.ordereslinkedlist;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.bridgelabz.functional.utility.datastructures.LinkedList;
public class OrderedLikedList {
		static int length;
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		 int[] ar=new int[length];
		ar= OrderedLikedList.fileInput();
		 for (int i = 0; i < length; i++) {
				linkedList.append(ar[i]);
			}
		System.out.println("enter number you want to search");
		Scanner scanner = new Scanner(System.in);
		int searchNumber = scanner.nextInt();
		int position = linkedList.search(searchNumber);
		System.out.println("position as   " + position);
		if (position >= 0) {
			System.out.println("number found at " + position);
			linkedList.pop(position);
		} else {
			linkedList.append(searchNumber);
			length = length + 1;
			
			linkedList.sort();
		}
		scanner.close();
		linkedList.printList("H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\datastructures\\ordereslinkedlist\\Numbers2.txt");
	}
	
	public static int[] fileInput() throws IOException {
		File file = new File(
				"H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\datastructures\\ordereslinkedlist\\Numbers.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		StringBuffer str = new StringBuffer();
		while ((st = br.readLine()) != null) {
			str.append(st);
		}
		String str1 = str.toString();
		String[] arrSplit = str1.split(" ");
		length = arrSplit.length;
		int arr[] = new int[length];
	
		for (int i = 0; i < length; i++) {
			System.out.println(arrSplit[i]);
			arr[i] = Integer.parseInt(arrSplit[i]);
		}
		br.close();
		return arr;
	}	}

	

	

	


