package org.bridgelabz.algorithms;
public class MaxValueNotes {
// To calculate Amount in Notes
	public static void main(String[] args) {
		int amount = 550;
		int notes[] = { 1000, 500, 100, 50, 10, 5, 2, 1 };
		int count[] = new int[8];
		for (int i = 0; i < 8; i++) {
			if (amount >= notes[i]) {
				count[i] = amount / notes[i];
				amount = amount - (count[i] * notes[i]);
			}

		}
		for (int i = 0; i < 8; i++) {

			System.out.println(notes[i] + "are " + count[i]);
		}

	}

}
