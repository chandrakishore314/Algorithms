package org.bridgelabz.functional.functions;

import java.util.Scanner;

public class Harmonic {

	static double nthHarmonic(int Number) 
	{ 
	
	    float harmonic = 1; 
	  
	    
	    for (int i = 2; i <=Number; i++) { 
	        harmonic += (float)1 / i; 
	    } 
	  
	    return harmonic; 
	} 
	  
	
	  
	    public static void main (String[] args) { 
	    	Scanner sc =new Scanner(System.in);
	    	System.out.println("enter Harmonic Number");
	            int Number ; 
	            Number=sc.nextInt();  
	    System.out.print(nthHarmonic(Number)); 
	      
	    } 

}
