package org.bridgelabz.algorithms;
import java.util.Scanner;
public class DayOfWeek {
	public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
System.out.println("enter the day");
int d = scanner.nextInt();
int m=scanner.nextInt();
int y=scanner.nextInt();
scanner.close();
int d0 =day(m, d, y);;  
System.out.println(d0+"values are as d0");
String str = null;
switch(d0) {
case 0: str="sunday";
break;
case 1: str="monday";
break;
case 2: str="tueday";
break;
case 3: str="wedday";
break;
case 4: str="thurday";
break;
case 5: str="friday";
break;
case 6: str="satday";
break;
}
System.out.println(str+"day is ");


}
// calculate Day based on Date,Month and Years
	public static int day(int m, int d, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 +y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;  
		return d0;
		
	}

}
