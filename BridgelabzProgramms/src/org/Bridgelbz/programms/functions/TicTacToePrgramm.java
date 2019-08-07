package org.Bridgelbz.programms.functions;

import java.util.Scanner;

public class TicTacToePrgramm {
	static int arr[][] = new int[3][3];
	static int r = 0;
	static int c = 0;

	public static void main(String[] args) {
		
		int value = -1;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = value;
				value--;
			}
		}

		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(count<9) {
			
				System.out.println("enter values");
				r = sc.nextInt();
				c = sc.nextInt();
				while (arr[r][c] > 0) {
					System.out.println("enter array value between 0 to 2");
					r = sc.nextInt();
					c = sc.nextInt();
				}
				arr[r][c] = 2;
				count++;
				dispBoard(arr);
				if(win(arr)==true) {
					System.out.println("game is over,human won the game");
					count=9;
					break;
					
				}
				else{
                   
		
				r = (int) (Math.random() * 3);
				c = (int) (Math.random() * 3);
				System.out.println(r + ",  " + c);
			while(arr[r][c] > 0) {
					System.out.println("enter array value again by cpu between 0 to 2");
					r = (int) (Math.random() * 3);
					c = (int) (Math.random() * 3);
				}
				arr[r][c] = 1;
				dispBoard(arr);
				if(win(arr)==true) {
					System.out.println("game is over cpu won the game");
					break;
			}
				count++;
				}
		}

	}
	static void dispBoard(int arr[][]) {

		for (int i = 0; i < arr.length; i++) {
		
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 2) {
					
					System.out.print(" o |");
					
				} else if (arr[i][j] == 1) {
					
					System.out.print(" x |");
				} else
					System.out.print("-  |");
			}
			System.out.println("|");
		}
		
		}
		
		
	

	private static boolean win(int[][] a) {
		for (int i = 0; i < 3; i++) {
			if (a[i][0] == a[i][1] && a[i][0] == a[i][2]) {
				return true;
			}
			if (a[0][i] == a[1][i] && a[2][i] == a[0][i]) {
				return true;
			}
		}
		if (a[0][1] == a[1][1] && a[2][2] == a[1][1]) {
			return true;
		}
		if (a[0][2] == a[1][1] && a[2][0] == a[0][2]) {
			return true;
		}
		return false;
	}
}