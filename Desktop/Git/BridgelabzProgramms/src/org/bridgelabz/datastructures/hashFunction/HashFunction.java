package org.bridgelabz.datastructures.hashFunction;

import java.io.IOException;

import org.bridgelabz.datastructures.ordereslinkedlist.LinkedList;

import com.bridgelabz.algorithms.Bubblesort;

public class HashFunction {
	public static void main(String[] args) throws IOException {
		int arr[] = LinkedList.fileInput();
		Bubblesort.sort(arr);
		hashFunction(arr);
	}
	private static void hashFunction(int[] arr) throws IOException {
		LinkedList hash[] = new LinkedList[11];
		int rem, length = arr.length;
		for (int i = 0; i < length; i++) {
			rem = arr[i] % 11;
			if (hash[rem] == null) {
				hash[rem] = new LinkedList();
				hash[rem].append(arr[i]);
			} else {
				hash[rem].append(arr[i]);
			}
		}
		for (int k = 0; k < 11; k++) {
			if(hash[k]!=null) {

			System.out.println(k + "-->");
			hash[k].printLinkedList();
			System.out.print(" ");
		}}

	}

}
