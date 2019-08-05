package org.bridgelabz.algorithms;

import java.util.Scanner;

public class MonthlyPayment {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter principle amount value");
			double p=sc.nextInt();
			System.out.println("enter number of years");
			double y=sc.nextInt();
			System.out.println("enter rate of intrest");
			double rt=sc.nextInt();
			  double r = (rt / 100) / 12;   
		        double n = 12 * y;          
		        double payment  = (p* r) / (1 - Math.pow(1+r, -n));
		        double interest = payment * n - p;

		        System.out.println("Monthly payments = " + payment);
		        System.out.println("Total interest   = " + interest);
			

	}

}
