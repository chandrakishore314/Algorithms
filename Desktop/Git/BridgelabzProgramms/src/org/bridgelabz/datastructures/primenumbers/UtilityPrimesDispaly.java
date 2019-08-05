package org.bridgelabz.datastructures.primenumbers;

import java.util.ArrayList;

import org.Bridgelbz.programms.Utility.dataStructures.StackLinkedList;

public class UtilityPrimesDispaly {
	void display(ArrayList<Integer> primes) {
		int array[][] = new int[10][100];
		int prev = 0, curret = 100, j = 0, k = 0;
		for (int i = 0; i < primes.size(); i++) {
			if (primes.get(i) >= prev && primes.get(i) <= curret) {
				k++;
				array[j][k] = primes.get(i);
			} else {
				prev += 100;
				curret += 100;
				j += 1;
				k = 0;
				array[j][k] = primes.get(i);
			}
		}
		for (int k1 = 0; k1 < 10; k1++) {
			for (int j1 = 0; j1 < 100; j1++) {
				if (array[k1][j1] != 0) {
					System.out.print(array[k1][j1] + " ");
				}
			}
			System.out.println();
		}
	}

	public ArrayList<Integer> anagrams(ArrayList<Integer> primes) {
		ArrayList<Integer> anagram = new ArrayList<Integer>();
		ArrayList<Integer> notAnagram = new ArrayList<Integer>();
		UtilityPrimesDispaly u = new UtilityPrimesDispaly();
		for (int t = 0; t < primes.size(); t++) {
			int num = primes.get(t);
			int rev = u.reverse(num);
			if (primes.contains(rev)) {
				anagram.add(num);
			} else {
				notAnagram.add(num);
			}
		}
		return anagram;/*
		System.out.println("Anagram numbers are");
		UtilityPrimesDispaly u1 = new UtilityPrimesDispaly();
		u1.display(anagram);
		System.out.println("Numbers are not Anagram ");
		u1.display(notAnagram);
		System.out.println("adding to the stack Linked List");
		u1.pushToStack(anagram);
		*/
	}

	public void pushToStack(ArrayList<Integer> anagram) {
		StackLinkedList<Integer> s = new StackLinkedList<Integer>();
		for (int i = 0; i < anagram.size(); i++) {
			s.push(anagram.get(i).intValue());
		}
		System.out.println("stack pop up data");
		for (int i = 0; i < anagram.size(); i++) {
			int data = s.pop();
			System.out.println(data);
		}
	}
	private int reverse(int num) {
		int rev = 0;
		while (num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		return rev;
	}

	public void pushToQueue(ArrayList<Integer> anagrams) {
		
		
	}

}
