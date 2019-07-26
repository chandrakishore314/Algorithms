package org.bridgelabz.datastructures.stack;

public class StackImplementation {

	public static void main(String[] args) {

		String str="(5+6)*(7+8)/(4+3)(5+6)*(7+8)/(4+3)";
		char ch[]=str.toCharArray();
		int length=ch.length;
		for(int start=0;start<length;start++) {
			if(ch[start]=='(') {
				StackMethods.push(ch[start]);}
			else if(ch[start]==')'){
				StackMethods.pop();
			}
			else {
			
			}
		}
		boolean flag=StackMethods.isBalanced();
		if(flag==true) {
			System.out.println("paranthesis are balanced");
		}else {
			System.out.println("paranthesis are not Balanced");
		}
		
	}

}
