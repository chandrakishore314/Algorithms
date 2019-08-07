package org.Bridgelbz.programms.Utility.dataStructures;

public class Stack <T>{

	int capacity;
	public Stack(int size) {
		capacity=size;
	}
	char stack[]=new char[capacity];
	
	static int top=-1;
	
	
	/* To add the elements*/ 
	public  void push(char ch) {
		top++;
		stack[top]=ch;
	}
	public  void pop() {
		char element = stack[top];
		top--;
	}
	public  boolean isEmpty() {
		return top==-1?true:false;
	}
	boolean isFull() {
		return top==-1;
	}
	/**
	 * 
	 * To Display the Elements
	 * **/
	
	public void display()
    {
        System.out.print("\nQueue = ");
        if (isEmpty())
        {
            System.out.print("Empty\n");
           
        }
        for (int i = 0; i <= top; i++)
            System.out.print(stack[i]+" ");
        System.out.println();        
    }
}
