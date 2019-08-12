package org.bridgelabz.functional.functions;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter number of rows");
int row=sc.nextInt();
System.out.println("enter number of columns");
int column=sc.nextInt();
int array[][]=new int[row][column];
	System.out.println("enter array elements");
	for(int i=0;i<row;i++) {
	   for(int j=0;j<column;j++) {	   
array[i][j]=sc.nextInt();
	   }		
	}
	sc.close();
	try {
        
        PrintWriter pw = new PrintWriter(System.out);
         
        
        for(int i=0;i<row;i++) {
     	   for(int j=0;j<column;j++) {	   
   pw.print(array[i][j]+" ");
     	   }	
     	   pw.println();
     	}
       
  pw.close();
	}
	catch (Exception ex) {
        ex.printStackTrace();
     }
	
	
	
	}

}
