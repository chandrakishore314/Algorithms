package org.Bridgelbz.programms.Utility.dataStructures;




public class QueueLinkedList<T> {
	Node<T> head;
	int current = 0;
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
	public int size() {
		return current;
	}
	public boolean isEmpty() {
		boolean flag;
		if (current == 0) {
			return true;
		} else {
			return false;
		}
	}
	public T remove() {
		if (isEmpty()) {
			System.out.println("Underflow");
		}
		Node<T> temp = head;
		head = temp.next;
		if (head == null) {
			current--;
		}
		return temp.data;
	}
}