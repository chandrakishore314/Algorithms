package org.bridgelabz.datastructures.dequeue;
import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String var ;
		 var=sc.nextLine();
		CustomDequeue<Character> cqueue = new CustomDequeue<Character>();
		int length = var.length();
		for (int i = 0; i < length; i++) {
			char ch = var.charAt(i);
			cqueue.addAtLast(ch);
		}
		int flag = 0;
		while (cqueue.size() > 0) {
			if (cqueue.removeAtEnd() != cqueue.removeAtFront()) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("it is polindrome");
		} else {
			System.out.println(" it is not a polindrome");
		}
	}
}
