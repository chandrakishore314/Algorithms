/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.deckofcards;

import org.Bridgelbz.programms.Utility.dataStructures.QueueLinkedList;

public class QueueOfDeckOfCards {
	public static void main(String[] args) {
		String[] suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks={ "Ace","2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10 ","Jack", "Queen", "King"};
		String[][] cards=new String[suits.length][ranks.length];
		
	for(int i=0;i<suits.length;i++) {
		for(int j=0;j<ranks.length;j++) {
			cards[i][j]=suits[i]+" "+ranks[j];
		}
	}
	
	String[][] deck = new String[suits.length][ranks.length]; 
for(int i=0;i<suits.length;i++) {
		for(int j=0;j<ranks.length;j++) {
			deck[i][j]=cards[i][j];
			
		}
	}

	for (int i = 0; i < suits.length; i++) {
		for (int j = 0; j < ranks.length; j++) {
			 int k = (int)(Math.random() *suits.length);
	    int l = (int)(Math.random() *ranks.length); 
	    
	    String temp = deck[i][j]; 
	    deck[i][j] = deck[k][l];
	    deck[k][l] = temp;
		}
	}
	QueueLinkedList<QueueLinkedList<String>> persons=new  QueueLinkedList<QueueLinkedList<String>>();
	QueueLinkedList<String> person=new QueueLinkedList<String>();
	for(int i=0;i<suits.length;i++) {
		
		for(int j=0;j<9;j++) {
			person.push(deck[i][j]);
		}
		persons.push(person);
		 person=new  QueueLinkedList<String>();
		}
	
	System.out.println(" displaying deck of cards");
	System.out.println();
	for(int i=0;i<persons.size();i++) {
		System.out.println("person"+(i+1));
	QueueLinkedList<String> alldata =persons.remove();
	for(int j=0;j<alldata.size();j++) {
		System.out.println(alldata.remove()+"\t\t");
	}
System.out.println();
	}
	
	
	
	
	}}
