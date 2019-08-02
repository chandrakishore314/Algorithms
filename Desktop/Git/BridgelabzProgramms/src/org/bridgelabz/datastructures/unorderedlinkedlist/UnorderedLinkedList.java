package org.bridgelabz.datastructures.unorderedlinkedlist;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedLinkedList {
	static Node head = null;
	Node tail = null;

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
		String[] arrSplit = str1.split(" ");
		for (int i = 0; i < arrSplit.length; i++) {
			append(arrSplit[i]);
		}
		System.out.println("enter word to search");
		Scanner sc = new Scanner(System.in);
		String searchWord;
		searchWord = sc.nextLine();
		int flag = search(searchWord);
		System.out.println(flag);
		if (flag > 0) {
			System.out.println("word is found");
			pop(flag);
		} else {
			append(searchWord);
		}
		printList();

	}

	private static void pop(int position) {
		if (head == null) {
			return;
		}
		Node temp = head;
		if (position == 0) {
			head = temp.next;
		}
		for (int i = 0; temp != null && i < position - 1; i++) {
			temp = temp.next;
		if (temp == null || temp.next == null)
			return;
		Node replace = temp.next.next;
		temp.next = replace;
	}}

	private static int search(String searchWord) {
		Node current = head;
		int position = 1;
		while (current != null) { // str2.equals(arrSplit[i])
			if (searchWord.equals(current.data)) {
				return position;
			}
			position++;
			current = current.next;
		}
		return 0;
	}

	private static void append(String new_data) {
		Node new_node = new Node(new_data);
		if (head == null) {
			head = new Node(new_data);
		} else {
			new_node.next = null;
			Node last = head;
			while (last.next != null)
				last = last.next;
			last.next = new_node;
		}
	}

	public static void printList() throws IOException {
		Node tnode = head;
		FileWriter fw = new FileWriter(
				"H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\datastructures\\unorderedlinkedlist\\UnorderedText");
		while (tnode != null) {
			System.out.println(tnode.data + " ");
			fw.write(tnode.data);
			fw.write(" ");
			tnode = tnode.next;
		}
		fw.close();
	}
}
