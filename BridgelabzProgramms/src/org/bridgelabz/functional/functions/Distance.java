package org.bridgelabz.functional.functions;


public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		
		 double distance = Math.sqrt(x*x + y*y);
		 
	        
	 System.out.println("distance from ( "+ x+" , " +y+") to (0, 0) = " + distance);
	}

}
