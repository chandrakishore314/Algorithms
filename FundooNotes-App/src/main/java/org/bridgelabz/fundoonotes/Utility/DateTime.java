package org.bridgelabz.fundoonotes.Utility;

import java.time.LocalDate;

public class DateTime {
	private DateTime() {
	}

	public static String today() {
		return LocalDate.now().toString();
	}
}