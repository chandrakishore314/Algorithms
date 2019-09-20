package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

// To calculate monthly payment and intrest
public class MonthlyPayment {

	public static void main(String[] args) {
			System.out.println("enter principle amount value");
			double p=InputScanner.getDouble();
			System.out.println("enter number of years");
			double y=InputScanner.getDouble();
			System.out.println("enter rate of intrest");
			double rt=InputScanner.getDouble();
			Utility.calculateIntrest(p,y,rt);
	}

}
