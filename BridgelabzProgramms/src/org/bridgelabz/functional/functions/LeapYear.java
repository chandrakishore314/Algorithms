package org.bridgelabz.functional.functions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter any year:");
        int year = s.nextInt();
        boolean flag = false;
        flag= find(year);
                if(flag)
        {
            System.out.println("Year "+year+" is a Leap Year");
        }
        else
        {
            System.out.println("Year "+year+" is not a Leap Year");
        }
                s.close();
	}
	public static boolean find(int year) {
		boolean flag = false;
       
        if(year % 400 == 0)
        {
            flag = true;
        }
        else if (year % 100 == 0)
        {
            flag = false;
        }
        else if(year % 4 == 0)
        {
            flag = true;
        }
        else
        {
            flag = false;
        }
		return flag;
	}
}
