package org.bridgelabz.datastructures.ordereslinkedlist;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class LinkedList {
	 Node head = null;

	static int length;
	public static void main(String[] args) throws IOException {
		LinkedList linkedList = new LinkedList();
		linkedList.fileInput();
		linkedList.sort();
		linkedList.printLinkedList();
		System.out.println("enter number you want to search");
		Scanner sc = new Scanner(System.in);
		int searchNumber = sc.nextInt();
		int position = linkedList.search(searchNumber);
		System.out.println("position as" + position);
		if (position > 0) {
			System.out.println("number found at " + position);
			linkedList.pop(position);
		} else {
			linkedList.append(searchNumber);
			length = length + 1;
			linkedList.sort();
		}
		linkedList.printList();
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
		LinkedList linkedList = new LinkedList();
		for (int i = 0; i < length; i++) {
			System.out.println(arrSplit[i]);
			linkedList.append(Integer.parseInt(arrSplit[i]));
			arr[i] = Integer.parseInt(arrSplit[i]);
		}
		return arr;
	}

	public void printList() throws IOException {
		Node tnode = head;
		FileWriter fw = new FileWriter(
				"H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\datastructures\\ordereslinkedlist\\Numbers2.txt",
				true);

		while (tnode != null) {
			fw.write(String.valueOf(tnode.data));
			fw.write(" ");
			System.out.println(tnode.data);
			tnode = tnode.next;
		}

		fw.close();
	}

	public void printLinkedList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.println(tnode.data + " ");

			tnode = tnode.next;
		}
	}

	private void sort() {
		if (length > 1) {
			for (int i = 0; i < length - 1; i++) {
				Node currentNode = head;
				Node after = head.next;
				for (int j = 0; j < length - 1 - i; j++) {
					if (currentNode.data > after.data) {
						int temp = currentNode.data;
						currentNode.data = after.data;
						after.data = temp;
					}
					currentNode = after;
					after = after.next;
				}
			}
		}
	}

	private void pop(int position) {
		if (head == null) {
			return;
		}
		Node temp = head;
		if (position == 0) {
			head = temp.next;
		}
		for (int i = 0; temp != null && i < position - 1; i++)
			temp = temp.next;
		if (temp == null || temp.next == null)
			return;
		Node next = temp.next.next;
		temp.next = next;
	}

	public void append(int new_data) {

		
		if (head == null) {
			head = new Node(new_data);
		} else {
			Node new_node = new Node(new_data);
			new_node.next = null;
			Node last = head;
			while (last.next != null) {
				last = last.next;}
			last.next = new_node;
		}

	}

	private int search(int searchNumber) {
		Node current = head;
		int position = 0;
		while (current != null) {
			if (searchNumber == current.data) {
				return position;
			}
			position++;
			current = current.next;
		}
		return 0;
	}

}
