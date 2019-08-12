package org.bridgelabz.algorithms;

import java.util.Scanner;

public class BinarySearchFindNumber {

	public static void main(String[] args) {
int n=Integer.parseInt(args[0]);
int low=0;
Scanner sc=new Scanner(System.in);
int high=(int) Math.pow(2,n);
System.out.println(high);
while(low<=high)	{
	
	int mid=(low+high)/2;
	if(low==high) {
		System.out.println("require number is "+high);
		break;
	}
	System.out.println("false for"+low+"to"+(mid)+"&& true for"+(mid+1)+"to"+high);
	boolean b=sc.nextBoolean();
	if(b) {
		low=mid+1;
	}else {
		high=mid;
	}
	
	
}
sc.close();
}
}
