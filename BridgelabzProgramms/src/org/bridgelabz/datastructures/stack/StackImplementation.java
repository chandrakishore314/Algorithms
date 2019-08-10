package org.bridgelabz.datastructures.stack;

import org.bridgelabz.functional.utility.datastructures.Stack;

public class StackImplementation {
	public static void main(String[] args) {

		String str="(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		char ch[]=str.toCharArray();
		int length=ch.length;
		Stack stack=new Stack(length);
		for(int start=0;start<length;start++) {
			if(ch[start]=='(') {
				stack.push(ch[start]);}
			else if(ch[start]==')'){
				stack.pop();
			}
			else {
			}
		}
		boolean flag=stack.isEmpty();
		if(flag==true) {
			System.out.println("paranthesis are balanced");
		}else {
			System.out.println("paranthesis are not Balanced");
		}
	}
}
