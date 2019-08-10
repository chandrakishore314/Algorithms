package org.bridgelabz.algorithms;
import java.util.Scanner;
/**
 * @author Chandra Kishore
 * **/
public class BinaryConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		int ar[] = toBinary(num);
		System.out.println("binary num as");
		for (int j = 7; j >= 0; j--) {
			System.out.print(ar[j]);
		}
		int numSwap = swap(ar);
		System.out.println();
		System.out.println("number after swap" + numSwap);
	}

	private static int swap(int[] br) {
		int num = 0;

		int ar[] = new int[8];
		for (int i = 0, j = 4; i < 4; i++, j++) {
			ar[j] = br[i];
		}
		for (int i = 4, j = 0; i < 8; i++, j++) {
			ar[j] = br[i];

		}
		System.out.println();
		for (int k = 0; k < 8; k++) {

			System.out.print(br[k]);
		}
		for (int j = 0; j < 8; j++) {
			if (ar[j] > 0)
				num += Math.pow(2, j);

		}
		return num;
	}
/**
 * @
 * **/
	private static int[] toBinary(int n) {
		int bin[] = new int[100];
		int i = 0;
		while (n > 0) {
			bin[i++] = n % 2;

			n = n / 2;

		}
		System.out.print("Binary number is : ");

		return bin;

	}

}
