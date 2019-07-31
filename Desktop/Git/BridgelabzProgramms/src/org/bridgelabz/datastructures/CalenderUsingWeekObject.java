package org.bridgelabz.datastructures;
import org.Bridgelbz.programms.functions.LeapYear;
import com.bridgelabz.algorithms.DayOfWeek;

import org.bridgelabz.datastructures.primenumbers.Node;
import org.bridgelabz.datastructures.primenumbers.QueueLinkedList;
public class CalenderUsingWeekObject {

	public static <T> void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
	String []months= {"january","febrary","march","april","may","june","july","augustt","sept","october","nov","december"};
int days[]= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
if (month == 2 && LeapYear.find(year)) {
	days[month] = 29;}
System.out.println(months[month-1] + " " + year);
System.out.println("S  M  T  W  Th  F  S ");
int d = DayOfWeek.day(month, 1, year);
QueueLinkedList<QueueLinkedList<Integer>> q=new QueueLinkedList<QueueLinkedList<Integer>>();
QueueLinkedList<Integer> week=new QueueLinkedList<Integer>();

for(int i=0;i<=d;i++) {
	week.push(0);
}
for(int i=1;i<days[month];i++) {

	week.push(i);
	if((i+d)%7==0|| (i == days[month])) {
		q.push(week);
		week=new QueueLinkedList<Integer>();
	}
}

for (int i = 0; i <=4; i++) {
	Node<QueueLinkedList<Integer>> weeks = q.removeObject();
	for (int j = 0; j < 7; j++) {
		System.out.print( "  "+week.remove());
	}
	System.out.println();
}

	}

}
