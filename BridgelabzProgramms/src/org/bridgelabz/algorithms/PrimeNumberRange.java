package org.bridgelabz.algorithms;
import org.bridgelbz.programms.utility.Utility;
import org.bridgelbz.programms.utility.algorithms.UtilityAlgorithms;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		ArrayList<Integer> al2=new <Integer>ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Range you want");
		int num=sc.nextInt();
	
		
	 al2 =   UtilityAlgorithms.PrimeNumbers(num);
	 System.out.println("prime numbers are");
	 for (Integer num1 : al2) {
		 System. out. println(num1);
		 }
boolean flag1 = false,flag2;

	 System.out.println("printing the primes are anagram & polindrome ");
	 int rev;
	for(int i=1;i<al2.size();i++) {
		int num1=al2.get(i).byteValue();
		rev= UtilityAlgorithms.Anagram(num1);
		if(num1==rev) {
			flag1=true;
		}
		flag2=UtilityAlgorithms.Polindrome(num1, al2);
		if(flag1==true&&flag2==true) {
			
			System.out.println(num1);
			
		}
	}
}
	}


