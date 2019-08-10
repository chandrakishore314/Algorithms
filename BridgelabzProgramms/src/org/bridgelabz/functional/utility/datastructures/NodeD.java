package org.bridgelabz.functional.utility.datastructures;



public class NodeD<T> {
	NodeD<T> next;
	NodeD<T> prev;
	T value;

	

	NodeD(T value) {
		next = null;
		prev = null;
		this.value = value;
	}

}
