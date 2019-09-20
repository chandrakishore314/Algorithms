package org.bridgelabz.algorithms;

import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		System.out.println("enter the day");
		int d = InputScanner.getInt();
		int m = InputScanner.getInt();
		int y = InputScanner.getInt();
		int d0 = Utility.day(m, d, y);
		System.out.println("day is "+Utility.displayDay(d0));
	}
}
