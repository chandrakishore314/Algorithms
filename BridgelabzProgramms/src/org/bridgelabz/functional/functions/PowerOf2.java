package org.bridgelabz.functional.functions;

// To print the power of 2
public class PowerOf2 {

	public static void main(String[] args) {
	
		 int n = Integer.parseInt(args[0]);
	        int i = 0;                
	        int powerOfTwo = 1;      
	       
	        while (i <= n) {
	            System.out.println(i + " " + powerOfTwo);   
	            powerOfTwo = 2 * powerOfTwo;               
	            i = i + 1;
	}

}
}
