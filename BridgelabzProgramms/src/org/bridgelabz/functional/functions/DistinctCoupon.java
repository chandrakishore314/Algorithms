package org.bridgelabz.functional.functions;

import java.util.Scanner;

public class DistinctCoupon {
	public static void main(String[] args) {
	int distinct=0,value,count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Number of distinct numbers u want ");
		int number= scanner.nextInt();
		boolean b[]=new boolean[number];
		while(distinct<number) {
		      	value=(int) (Math.random()*number);
		      	System.out.println(value);
		      	count++;
			if(!b[value]) {
				distinct++;
				b[value]=true;	
			}
		}
		System.out.println("distinct numbers are"+count);
		scanner.close();
	}

}
