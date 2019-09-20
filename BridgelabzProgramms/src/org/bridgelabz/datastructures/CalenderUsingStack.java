package org.bridgelabz.datastructures;

import org.bridgelabz.functional.functions.LeapYear;
import org.bridgelabz.functional.utility.datastructures.QueueLinkedList;
import org.bridgelabz.functional.utility.datastructures.StackLinkedList;
import org.bridgelabz.programms.utility.Utility;
public class CalenderUsingStack {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "january", "febrary", "march", "april", "may", "june", "july", "augustt", "sept", "october",
				"nov", "december" };
		int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && LeapYear.find(year)) {
			days[month] = 29;
		}
		System.out.println(months[month - 1] + " " + year);
		System.out.println("S    M   T   W    Th    F    S ");
		int d = Utility.day(month, 1, year);
		StackLinkedList<QueueLinkedList<Integer>> q = new StackLinkedList<QueueLinkedList<Integer>>();
		QueueLinkedList<Integer> week = new QueueLinkedList<Integer>();

		for (int i = 0; i <= d; i++) {
			week.push(0);
		}
		for (int i = 1; i <= days[month]; i++) {

			week.push(i);
			if ((i + d) % 7 == 0 || (i == days[month])) {
				q.push(week);
				week = new QueueLinkedList<Integer>();
			}
		}

		for (int i = 0; i <= q.size(); i++) {
			QueueLinkedList<Integer> weeks = q.pop();
			for (int j = 0; j < weeks.size(); j++) {
				int k = weeks.remove();
				if (k == 0)
					System.out.print("    ");
				else
					System.out.print(k+ "   ");
			}
			System.out.println();
		}

	}

}
