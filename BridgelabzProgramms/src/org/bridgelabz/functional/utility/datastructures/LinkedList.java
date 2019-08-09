package org.bridgelabz.programms.utility.datastructures;

import java.io.FileWriter;
import java.io.IOException;

public class LinkedList<T extends  Comparable>  {
	Node<T> head;
	 int length=0;

 //  adding data to linked list of T Type
 	public void append(T data) {
		if (head == null) {
			head = new Node<T>(data);
		} else {
			Node<T> new_node = new Node<T>(data);
			new_node.next = null;
			Node<T> last = head;
			while (last.next != null) {
				last = last.next;}
			last.next = new_node;
		}
    length++;
	}
 	
 	// length of linked list
 	int size() {
 		return length;
 	}
 	//Displaying the data
public void printLinkedList() {
	Node<T> tnode = head;
	while (tnode != null) {
		System.out.println(tnode.data + " ");

		tnode = tnode.next;
	}
}
//search for the data and return position
public int search(T searchNumber) {
	Node<T> current = head;
	int position = 0;
	while (current != null) {
		position++;
		if (searchNumber.compareTo(current.data)==0) {
			return position;
		}
		
		current = current.next;
	}
	return 0;
}
// delete element at specified position
public void pop(int position) {
	if (head == null) {
		System.out.println("no element present to del");
	}
	Node<T> temp = head;
	if (position == 0) {
		head = temp.next;
	}
	for (int i = 1; temp != null && i < position - 1; i++) {
		temp = temp.next;
		}
	if (temp == null || temp.next == null)
		return;
	Node<T> next = temp.next.next;
	temp.next = next;
	length--;
}
//deleting last element and return the data
public T pop() {
	T value;
	if (head == null) {
		System.out.println(" No element present to delete");
	}
	Node<T> temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	length--;
	value=temp.data;
	return value;

}

public void sort() {
	if (length > 1) {
		for (int i = 0; i < length ; i++) {
			Node<T> currentNode = head;
			Node<T> after = head.next;
			for (int j = 0; j < length - 1 - i; j++) {
				if ((currentNode.data).compareTo(after.data)>0) {
					T temp = currentNode.data;
					currentNode.data = after.data;
					after.data = temp;
				}
				currentNode = after;
				after = after.next;
			}
		}
	}}
boolean isEmpty(){
	return length==0;
	
}
//printing the Data

public void printList(String s) throws IOException {
	Node<T> currentNode = head;
	
	FileWriter fw = new FileWriter(s);

	for (int i = 0; i < length; i++)  {
		fw.write(String.valueOf(currentNode.data));
		fw.write(" ");
		currentNode=currentNode.next;
	}

	fw.close();
}


}
