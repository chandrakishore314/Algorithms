package org.bridgelbz.programms.utility.datastructures;
import org.bridgelbz.programms.utility.datastructures.Node;;


public class StackLinkedList<T> {
	 Node<T> top;
	 int current=0;
	public void push(T data) {
		Node<T> temp = new Node<T>(data);
		
		if (top == null) {
			top=temp;
		} else {
			
		        temp.next = top; 
		        top = temp;
		}
		current++;
	}
	
	public T pop() {
		
		Node<T> temp=top;
		 if (top == null) { 
	            System.out.print("\nStack Underflow"); 
	            
	        } 
		
		current--;
		top=top.next;
		return temp.data;
	}
	 public void display() 
	    { 
	        // check for stack underflow 
	        if (top == null) { 
	            System.out.printf("\nStack Underflow"); 
	            
	        } 
	        else { 
	            Node temp = top; 
	            while (temp != null) { 
	  
	                System.out.println( temp.data); 
	  
	                temp = temp.next; 
	            } 
	        } 
	    }

	public int size() {
		
		return current;
	}}
