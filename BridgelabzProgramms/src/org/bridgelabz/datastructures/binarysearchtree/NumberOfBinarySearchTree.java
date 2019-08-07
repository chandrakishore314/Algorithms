package org.bridgelabz.datastructures.binarysearchtree;
import org.Bridgelbz.programms.Utility.dataStructures.BinarysearchTree;

import java.util.Scanner;
public class NumberOfBinarySearchTree {
public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter size of array");
int num=scanner.nextInt();
int array[]=new int[num];

for(int i=0;i<num;i++) {
	array[i]=scanner.nextInt();
}
BinarysearchTree<Integer> bst=new BinarysearchTree<Integer>();
for(int j=0;j<num;j++) {
	bst.insert(array[j]);
}
bst.inOrder();
int i,fact=1;  
int fact1=(int) ((Math.pow(2, num))-num);
System.out.println("fact is"+fact1);
double mod=fact1/10e8+7;
System.out.println("\npossibilities in Binary search Tree "+mod);
	}
}
