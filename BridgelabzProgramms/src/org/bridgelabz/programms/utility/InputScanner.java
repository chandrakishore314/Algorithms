package org.bridgelabz.programms.utility;

import java.util.Scanner;

public class InputScanner {
	private InputScanner() {
	}

	private static Scanner scanner = new Scanner(System.in);

	public static String getString() {
		return scanner.next();
	}

	public static int getInt() {
		return scanner.nextInt();
	}

	public static long getLong() {
		return scanner.nextLong();
	}

	public static boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public static double getDouble() {
		return scanner.nextDouble();
	}
}
