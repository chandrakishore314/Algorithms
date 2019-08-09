package org.bridgelabz.datastructures.unorderedlinkedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.bridgelabz.programms.utility.datastructures.LinkedList;

public class UnorderedLinkedList {
	
	
	public static void main(String[] args) throws IOException {
		File file = new File(
				"H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\datastructures\\unorderedlinkedlist\\UnorderedText");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		StringBuffer str = new StringBuffer();
		while ((st = br.readLine()) != null) {
			str.append(st);
		}
		String str1 = str.toString();
		LinkedList<String> linkedList=new LinkedList<String>();
		String[] arrSplit = str1.split(" ");
		for (int i = 0; i < arrSplit.length; i++) {
			linkedList.append(arrSplit[i]);
		}
		System.out.println("enter word to search");
		Scanner sc = new Scanner(System.in);
		String searchWord;
		searchWord = sc.nextLine();
		int flag = linkedList.search(searchWord);
		System.out.println(flag);
		if (flag > 0) {
			System.out.println("word is found");
			linkedList.pop(flag);
		} else {
			linkedList.append(searchWord);
		}
		linkedList.printList("H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\datastructures\\ordereslinkedlist\\Numbers2.txt");

	}

	
}
