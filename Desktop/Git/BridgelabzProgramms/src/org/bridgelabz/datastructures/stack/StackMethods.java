package org.bridgelabz.datastructures.stack;
public class StackMethods {
	 
	
	

	char[] stack;
	public StackMethods(int length) {
	
	 stack =new char[length];	
	}

	
	static int top=-1;
	
	
	 
	public  void push(char ch) {
		top++;
		stack[top]=ch;
	}
	public  void pop() {
		char element = stack[top];
		top--;
	}
	public  boolean isBalanced() {
		return top==-1?true:false;
	}
}
