package org.bridgelabz.programms.functions;


import java.util.Scanner;

public class PrimeFactor {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter Number ");
		int n = scanner.nextInt();
		primeFactors(n);

	}

	public static void primeFactors(int n) {
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}

		for (int i = 3; i <= Math.sqrt(n); i += 2) {
			
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}

		if (n > 2)
			System.out.print(n);
	}

}
