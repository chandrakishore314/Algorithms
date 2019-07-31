package org.bridgelabz.datastructures.primenumbers;

import java.util.Iterator;

public class QueueLinkedList<T> {
	Node<T> head;
	static int current = 1;
	public void push(T data) {
		Node<T> temp;
		Node<T> node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			node.next = null;
			temp.next = node;
		}
		current++;
	}
	public T remove() {
		Node<T> temp = head;
	
		head=temp.next;
		return temp.data;
	}
	public Node<T> removeObject() {
		Node<T> temp = head;
		
		head=temp.next;
		return temp.next;
	}


	

}
