/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.deckofcards;

import org.bridgelbz.programms.utility.datastructures.QueueLinkedList;

public class QueueOfDeckOfCards {
	public static void main(String[] args) {
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11 Jack", "12 Queen",
				"13 King" };
		
		int Ace=1;
		int Jack=11;
		int Queen=12;
		int King=13;
		int num=Integer.parseInt(ranks[0]);
		System.out.println(num);
		
		
		
		String[][] cards = new String[suits.length][ranks.length];
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				cards[i][j] = suits[i] + " " + ranks[j];
			}
		}
		String[][] deck = new String[suits.length][ranks.length];
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck[i][j] = cards[i][j];
			}
		}
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				int k = (int) (Math.random() * suits.length);
				int l = (int) (Math.random() * ranks.length);

				String temp = deck[i][j];
				deck[i][j] = deck[k][l];
				deck[k][l] = temp;
			}
		}
		QueueLinkedList<QueueLinkedList<String>> persons = new QueueLinkedList<QueueLinkedList<String>>();
		QueueLinkedList<String> person = new QueueLinkedList<String>();
		for (int i = 0; i < suits.length; i++) {

			for (int j = 0; j < 9; j++) {
				person.push(deck[i][j]);
			}
			persons.push(person);
			person = new QueueLinkedList<String>();
		}

		System.out.println(" displaying deck of cards");
		System.out.println();
		String[][] sort = new String[4][9];
		for (int i = 0; i < persons.size(); i++) {
			QueueLinkedList<String> alldata = persons.remove();
			for (int j = 0; j < alldata.size(); j++) {
				sort[i][j] = alldata.remove();
			}
		}
		String p1[]=new String[9];
		for (int i = 0; i < 9; i++) {
			p1[i]=sort[0][i];
			
			
		}
		String[] s1=null;
		String[] s2=null;	
		int num1;//Integer.parseInt(s1[1].trim());
		int num2;
		for (int i = 0; i < p1.length - 1; i++) {

			for (int j = 0; j < p1.length - 1 - i; j++) {
				
				s1 = p1[j].split(" ");
				num1 = Integer.parseInt(s1[1]);
				s2 = p1[j + 1].split(" ");
				num2 = Integer.parseInt(s2[1]);
				
				if (num1 > num2) {
					
					String temp = p1[j];
					p1[j] = p1[j + 1];
					p1[j + 1] = temp;

				}
			}

		}
		System.out.println(" After sorting");
		for(int i=0; i < p1.length; i++) {
			System.out.println(p1[i]);
		}
		
	
	}
}
