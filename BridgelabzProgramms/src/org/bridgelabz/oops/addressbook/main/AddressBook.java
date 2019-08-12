package org.bridgelabz.oops.addressbook.main;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bridgelabz.oops.addressbook.interfaces.AdressFunctions;
import  org.bridgelabz.oops.addressbook.interfacesimpl.AddresssImplentation;
import org.bridgelabz.oops.addressbook.workingwithjson.WorkingWithJSon;
import org.bridgelabz.functional.utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.bridgelabz.oops.addressbook.model.Person;

public class AddressBook  {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		
		 Scanner scanner=Utility.getScanner();
		 AdressFunctions adressFunctions=new AddresssImplentation();
		 
		 WorkingWithJSon WorkingWithJSon=new WorkingWithJSon();
		
		 List<Person> jsondata=new  ArrayList<Person>();
		 int choice = 0;
		int number = 8;
		 jsondata= WorkingWithJSon.readInventoryData();
		do {
			 System.out.println("enter ur choice : 1. To sort By Last Name  1. To sort By pincode  3 . To  Dispalay Data\n"
				 		+ "4.To add the person  5.To edit data by First Name 6.To removeByFirstName\n"
						 +"7. Write persons data to json");
			choice=scanner.nextInt();
		switch(choice) {
		
		case 1: adressFunctions.sortBYLastName(jsondata);
		        break;
		case 2: adressFunctions.sortBYPincode(jsondata);
		         break;
		case 3: adressFunctions.display(jsondata);
		         break;
		case 4:	adressFunctions.addPerson(jsondata,1);
		        break;
		case 5:adressFunctions.editByFirstName(jsondata);
		        break;
		case 6:jsondata=adressFunctions.removeByFirstName(jsondata);
		        break;
		case 7:  WorkingWithJSon.writeToJson(jsondata);
		         break;
		case 8:  number=0;
		      break;
		}
		}while(number==8);
}}
