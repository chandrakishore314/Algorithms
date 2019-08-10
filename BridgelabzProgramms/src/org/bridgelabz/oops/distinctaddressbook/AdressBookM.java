       package org.bridgelabz.oops.distinctaddressbook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bridgelabz.functional.utility.Utility;
import org.codehaus.jackson.map.ObjectMapper;

public class AdressBookM {

	public static void main(String[] args) throws IOException {
		String firstname;
		String lastname;
	    String phonenumber;
		String city;
		String state;
		long pincode;
		List<AddressBook> addresslist=new ArrayList<AddressBook>(); 
	
		
		AddressBook addressbook=new AddressBook();
		Scanner scanner =new Scanner(System.in); 
		for(int i=0;i<3;i++) {
		
			Family family=new Family();
			Business business=new Business();
			Friends friends=new Friends();
			Office office=new Office();
			System.out.println("1.To enter family contacts 2.To enter Business contacts\n"
					+ "3. To enter friends contacts 4. To enter Office contacts");
			
			
			System.out.println(" enter first name");
			firstname=scanner.next();
			System.out.println(" enter last name");
			lastname=scanner.next();
			System.out.println(" enter ph number");
			phonenumber=scanner.next();
			System.out.println(" enter city");
			 city=scanner.next();
			 System.out.println(" enter state");
			 state=scanner.next();
			 System.out.println(" enter pincode");
			 pincode=scanner.nextLong();
			 family.setFirstname(firstname);
			 family.setLastname(lastname);
			 family.setPhonenumber(phonenumber);
			 family.setCity(city);
			 family.setState(state);
			 family.setPincode(pincode);
			 
			 friends.setFirstname(firstname);
			 friends.setLastname(lastname);
			 friends.setPhonenumber(phonenumber);
			 friends.setCity(city);
			 friends.setState(state);
			 friends.setPincode(pincode);
			 
			 business.setFirstname(firstname);
			 business.setLastname(lastname);
			 business.setPhonenumber(phonenumber);
			 business.setCity(city);
			 business.setState(state);
			 
			 
			 office.setFirstname(firstname);
			 office.setLastname(lastname);
			 office.setPhonenumber(phonenumber);
			 office.setCity(city);
			 office.setState(state);
			 
			 addressbook.setFamily(family);
			 
			 
			 addressbook.setBusiness(business);
			 addressbook.setOffice(office);
			 addressbook.setFriends(friends);
			 addresslist.add(addressbook);
			
		}
		
		ObjectMapper objectMapper=Utility.getObjectMapper();
		File file=	new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/distinctaddressbook/address.json");
		 FileWriter fw = new FileWriter(file);
		objectMapper.writeValue(fw, addresslist);
	}

}
