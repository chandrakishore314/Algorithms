package org.bridgelabz.datastructures.dequeue;

public class NodeD<E> {
	NodeD<E> next;
	NodeD<E> prev;
	E value;

	NodeD() {
		next = null;
		prev = null;
	}

	NodeD(E value) {
		next = null;
		prev = null;
		this.value = value;
	}

}
