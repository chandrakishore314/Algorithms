package org.bridgelabz.functional.utility;

import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;

public class Utility {

	public static Scanner getScanner() {
		Scanner scanner= new Scanner(System.in);
		return scanner;
	}

	
	public static ObjectMapper getObjectMapper() {
	ObjectMapper objectMapper=new ObjectMapper();
	return objectMapper;
	}
}
