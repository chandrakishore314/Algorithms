package org.bridgelabz.algorithms;



import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length of array");
		int length=sc.nextInt();
		int ar[]=new int[length];
		for(int i=0; i<length;i++) {
			ar[i]=sc.nextInt();
			}
		int arr[]=sort(ar);
		

	for(int i=0;i<length;i++) {
	System.out.println(arr[i]);
	}
	
	}

	public static int[] sort(int[] ar) {
		int n=ar.length,temp;                                             
		for(int i=0;i<n-1;i++)	{
			for(int j=0;j<n-1-i;j++)	{
				if(ar[j]>ar[j+1]) {
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
	}
		return ar;
}
}