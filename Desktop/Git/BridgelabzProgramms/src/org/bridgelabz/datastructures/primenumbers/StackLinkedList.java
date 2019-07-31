package org.bridgelabz.datastructures.primenumbers;

public class StackLinkedList {
	 Node head;
	static int current=1;

	void push(int data) {
		Node temp;
		Node node = new Node(data);
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
	
	public int pop() {
		Node temp = head;
		int value;
		for(int i=1;i<current-1;i++) {
			temp = temp.next;
		}
		value=(int) temp.data;
		current--;
		return value;
	}
}
