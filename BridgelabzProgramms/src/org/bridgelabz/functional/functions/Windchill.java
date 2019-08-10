package org.bridgelabz.functional.functions;

import java.util.Scanner;

public class Windchill {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter temparature value");
double t = sc.nextDouble();
System.out.println("enter wind sppeed");
double v = sc.nextDouble();
double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);

System.out.println("Wind chill  = " + w);
		
		
	}

}
