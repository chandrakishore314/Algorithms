package org.bridgelabz.datastructures.ordereslinkedlist;

public class UtilityOfLinkedList {

	public static void sort(int[] arrayNumber) {
int length=arrayNumber.length;
int temp;
    for(int i=0;i<length-1;i++) {
	  for(int j=0;j<length-1-i;j++) {
		   if(arrayNumber[j]>arrayNumber[j+1]) {
		    	temp=arrayNumber[j];
			      arrayNumber[j]=arrayNumber[j+1];
			     arrayNumber[j+1]=temp;
		}
	}
}
		
	}
	
	

}
