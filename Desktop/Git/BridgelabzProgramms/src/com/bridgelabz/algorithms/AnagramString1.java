package com.bridgelabz.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter string one");
		String str1=sc.nextLine();
		char[] s1 = str1. toCharArray();
		System.out.println("enter string2");
		String str2=sc.nextLine();
		char[] s2 = str2. toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		int l1=str1.length();
		int l2=str2.length();
		int num=0;
		/*
		if(l1==l2) {
			for(int i=0;i<l1;i++) {
				for(int j=0;j<l2;j++)
				
				if(s1[i]==s2[j]) {
					
					num++;
				}
				
			}
			
			
		}else {
			
			System.out.println("these 2 words are not Anangrams");
		}
		System.out.println(num+"num value");
       if(num==l1)
    	   System.out.println("Anagram strings");
       else System.out.println("Not Anagram strings");
		*/ 
		boolean status = Arrays.equals(s2, s1);
		System.out.println("status is "+status);
		
		
	}

}
