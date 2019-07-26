package org.bridgelabz.datastructures.stack;

import java.util.Stack;

public class StackMethods {
	static char[] stack =new char[120];
	static int top=-1;
	public static void push(char ch) {
		top++;
		stack[top]=ch;
	}
	
	public static void pop() {
		char element = stack[top];
		top--;
		
		
	}
	public static boolean isBalanced() {
		return top==-1?true:false;
		
	}
	
}
