package org.bridgelabz.programms.utility.datastructures;

public class Queue<T> {

	int capacity;
	public Queue(int size) {
		capacity=size;
	}
	int queue[]=new int[capacity];
	
	int front =-1,rear = -1; 
	
	public  void push(int data) {
		rear++;
		queue[rear]=data;
	}
	/* To check the Queue is Full*/
	boolean isFull() {
		return capacity==rear;
	}
	/* To check the Queue is Empty*/
	boolean isEmpty()
	{	 
         return front==rear; 
     } 
	/* To Display the elements  */
	public void display()
    {
        System.out.print("\nQueue = ");
        if (isEmpty())
        {
            System.out.print("Empty\n");
           
        }
        for (int i = front; i <= rear; i++)
            System.out.print(queue[i]+" ");
        System.out.println();        
    }
	public void pop() {
		rear--;
		
	}
}

