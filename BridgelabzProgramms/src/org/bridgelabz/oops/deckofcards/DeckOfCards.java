/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.deckofcards;

import java.util.Date;

public class DeckOfCards {

	public static void main(String[] args) {
		String[] suits= {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] ranks={"Jack", "Queen", "King", "Ace","2  ", "3  ", "4  ", "5  ", "6  ", "7  ", "8  ", "9  ", "10 "};
		String[][] cards=new String[suits.length][ranks.length];
		
	for(int i=0;i<suits.length;i++) {
		for(int j=0;j<ranks.length;j++) {
			cards[i][j]=suits[i]+ranks[j];
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
	System.out.println(" displaying deck of cards");
	for(int i=1;i<=4;i++) {
		System.out.print("person"+i +"\t \t\t");
	}
	System.out.println();
	
	for(int i=0;i<3;i++) {
		
		for(int j=0;j<12;j++) {
	        System.out.print(deck[i][j] +"\t\t");
	        if(j==3||j==7||j==11) {
	        	System.out.println();
	        }
	      
	   }
	
	}
Date d=new Date();
String s=d.toString();
System.out.println(s);
	}}
