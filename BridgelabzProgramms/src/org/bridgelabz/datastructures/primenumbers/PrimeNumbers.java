package org.bridgelabz.datastructures.primenumbers;

import java.util.ArrayList;
import java.util.Scanner;

import org.bridgelabz.programms.utility.Utility;

public class PrimeNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes = Utility.PrimeNumbers(1000);
		UtilityPrimesDispaly u=new UtilityPrimesDispaly();
		ArrayList<Integer> anagrams=u.anagrams(primes);
		
		
		
		System.out.println("enter your choice:(1)primes upto 1000 \n"
				+ "(2)Anagrams upto 1000\n"+
				"(3)Using Stack Anagrams in reverse order\n"
				+"(4)Using Stack Anagrams in reverse order\n");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		switch(num) {
		case 1:u.display(primes);
		case 2:u.anagrams(primes);
		case 3:u.pushToStack(anagrams);
		         
		case 4:u.pushToQueue(anagrams);
		}
		
		scanner.close();
	}
}