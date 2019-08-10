package org.bridgelabz.functional.functions;

import java.util.Scanner;

public class Quardiatic {

	public static void main(String[] args) {
		
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a,b,c values");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
 
    float delta=b*b-4*a*c;
    System.out.println("delta "+delta);
    if(delta>0) {
    	   float root1 = 0,root2 = 0;
   root1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
    root2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
    System.out.println(root1);
    System.out.println(root2);
    }else {
    	double realPart = -b / (2 *a);
        double imaginaryPart = Math.sqrt(-delta) / (2 * a);
        System.out.printf("roots as"+ realPart+"+"+imaginaryPart+"i");
    	
    }
    
  
	}

}
