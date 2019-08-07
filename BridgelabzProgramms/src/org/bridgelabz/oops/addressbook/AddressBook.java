package org.bridgelabz.oops.addressbook;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import org.Bridgelbz.programms.Utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class AddressBook  {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		 Scanner scanner=Utility.getScanner();
		 AddresssImplentation addresssImplentation=new AddresssImplentation();
		 System.out.println("enter number of persons data  to enter");
		 int number=scanner.nextInt();
		 WorkingWithJSon WorkingWithJSon=new WorkingWithJSon();
		addresssImplentation.addPerson(number);
		 
		int choice = 0;
		
		List<Person> jsondata= WorkingWithJSon.readInventoryData();
		while(true) {
			 System.out.println("enter ur choice : 1. To sort By Last Name  1. To sort By pincode  3 . To  Dispalay Data\n"
				 		+ "4.To add the person  5.To edit data by First Name 6.To removeByFirstName\n"
						 +"7. Write persons data to json");
			choice=scanner.nextInt();
		switch(choice) {
		
		case 1: addresssImplentation.sortBYLastName(jsondata);
		        break;
		case 2: addresssImplentation.sortBYPincode(jsondata);
		         break;
		case 3: addresssImplentation.display();
		         break;
		case 4:	addresssImplentation.addPerson(1);
		        break;
		case 5:addresssImplentation.editByFirstName(jsondata);
		        break;
		case 6:jsondata=addresssImplentation.removeByFirstName(jsondata);
		        break;
		case 7:  WorkingWithJSon.writeToJson(jsondata);
		         break;
		 default:System.exit(0); 
		
		
		}}
}}
