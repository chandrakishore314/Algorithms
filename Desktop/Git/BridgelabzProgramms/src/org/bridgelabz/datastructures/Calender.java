package org.bridgelabz.datastructures;
import org.Bridgelbz.programms.functions.LeapYear;
import com.bridgelabz.algorithms.DayOfWeek;

public class Calender {

	public static void main(String[] args) {

		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
	String []months= {"january","febrary","march","april","may","june","july","augustt","sept","october","nov","december"};
int days[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
if (month == 2 && LeapYear.find(year)) {
	days[month] = 29;}
System.out.println(months[month-1] + " " + year);
System.out.println("S  M  T  W  Th  F  S ");

int d = DayOfWeek.day(month, 1, year);
for(int i=0;i<=d;i++) {
	System.out.print("  ");
}
for(int i=1;i<days[month];i++) {

	System.out.print("  "+i);
	if((i+d)%7==0|| (i == days[month])) {
		System.out.println( );
	}
}

	}


}
