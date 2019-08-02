package org.bridgelabz.datastructures.dequeue;
public class CustomDequeue<E> {
	int count = 0;
	NodeD<E> front;
	NodeD<E> end;

	void addAtFront(E data) {
		NodeD<E> node = new NodeD<E>(data);
		if (isEmpty()) {
			front.value = data;
			end = front;
		} else {
			NodeD<E> temp = null;
			temp.value = data;
			temp.next = front;
			front.prev = temp;
			front = temp;
		}
		count++;
	}

	void addAtLast(E item) {
		NodeD<E> temp = new NodeD<E>(item);
		if (isEmpty()) {
			front = temp;
			end = front;
		} else {

			end.next = temp;
			temp.prev = end;
			end = temp;
		}
		count++;
	}
	E removeAtFront() {
		E rmValue = null;
		if (isEmpty()) {
			System.out.println("No Element present to Delete");
		} else {

			rmValue = front.value;
			front = front.next;
			
			count--;

		}
		return rmValue;
	}

	E removeAtEnd() {
		E rmValue = null;
		if (isEmpty()) {
			System.out.println("No Element present to Delete");
		} else {
			rmValue = end.value;
			end = end.prev;
			end.next = null;
			count--;

		}
		return rmValue;

	}

	private boolean isEmpty() {
		return count == 0;
	}

	int size() {

		return count;

	}

}
