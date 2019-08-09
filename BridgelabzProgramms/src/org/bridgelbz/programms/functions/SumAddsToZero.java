package org.bridgelbz.programms.functions;

import java.util.Scanner;

public class SumAddsToZero {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		 int distNumber=0;
			System.out.println("enter array size");
			int num=sc.nextInt();
			int array[]=new int[num];
			for(int i=0;i<num;i++) {
				array[i]=sc.nextInt();
			}
			for (int i = 0; i < num - 2; i++) { 
				  
	            
	            for (int j = i + 1; j < num - 1; j++) { 
	  
	               
	                for (int k = j + 1; k < num; k++) { 
	                    if (array[i] + array[j] + array[k] == 0) { 
	                        System.out.println("Triplet is " + array[i] + ", " + array[j] + ", " + array[k]); 
	                 
					distNumber++;
	                    } 
	                } 
	            }
			
			}
			System.out.println( "distinct numbers "+distNumber);
	}
}