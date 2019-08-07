package org.Bridgelbz.programms.Utility.dataStructures;

public class DoubleLinkedList<T> {

		int count = 0;
		NodeD<T> front;
		NodeD<T> end;

		void addAtFront(T data) {
			NodeD<T> node = new NodeD<T>(data);
			if (isEmpty()) {
				front.value = data;
				end = front;
			} else {
				NodeD<T> temp = null;
				temp.value = data;
				temp.next = front;
				front.prev = temp;
				front = temp;
			}
			count++;
		}

		public void addAtLast(T item) {
			NodeD<T> temp = new NodeD<T>(item);
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
		public T removeAtFront() {
			T rmValue = null;
			if (isEmpty()) {
				System.out.println("No Element present to Delete");
			} else {

				rmValue = front.value;
				front = front.next;
				
				count--;

			}
			return rmValue;
		}

		public T removeAtEnd() {
			T rmValue = null;
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

		public int size() {

			return count;

		}

	}



