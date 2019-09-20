package org.bridgelabz.datastructures.hashFunction;
import java.io.IOException;

import org.bridgelabz.datastructures.ordereslinkedlist.OrderedLikedList;
import org.bridgelabz.functional.utility.datastructures.LinkedList;
import org.bridgelabz.programms.utility.Utility;

public class HashFunction {
	public static void main(String[] args) throws IOException {
	
		int arr[] = OrderedLikedList.fileInput();
		Utility.sort(arr);
		hashFunction(arr);
	}
	private static void hashFunction(int[] arr) throws IOException {
		LinkedList<Integer> hash[] = new LinkedList[11];
		int rem, length = arr.length;
		for (int i = 0; i < length; i++) {
			rem = arr[i] % 11;
			if (hash[rem] == null) {
				hash[rem] = new LinkedList<Integer>();
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
