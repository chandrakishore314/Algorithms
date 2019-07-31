package org.bridgelabz.datastructures.binarysearchtree;

import java.util.Scanner;

public class BinarySearchTree {

	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter size of array");
int num=scanner.nextInt();
int array[]=new int[num];

for(int i=0;i<num;i++) {
	array[i]=scanner.nextInt();
}
BinarySearchImplementation bst=new BinarySearchImplementation();
for(int j=0;j<num;j++) {
	bst.insert(array[j]);
}
bst.display();
int i,fact=1;  
for(i=1;i<=num;i++){    
    fact=fact*i;   
}
System.out.println("fact is"+fact);
double mod=fact/10e8+7;
System.out.println("\npossibilities in Binary search Tree "+mod);
	}
}
