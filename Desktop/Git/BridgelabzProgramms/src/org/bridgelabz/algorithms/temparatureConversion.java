package org.bridgelabz.algorithms;

import java.util.Scanner;

public class temparatureConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("celsius or farenheat conversion");
		String ch=sc.next();
		switch(ch) {
		case "c":
			System.out.println("ente celsius temp");
			int c=sc.nextInt();
			double f=(c*9/5)+32;
			System.out.println("farenheat value is"+f);
			break;
		case "f":
			int f1=sc.nextInt();
			double c1=(f1-32)*5/9;
			System.out.println("celsius values are"+c1);
			break;	
		default: 
		    System.out.println("pls enter c or f conversions"); 
		}
				
				

			}

}
