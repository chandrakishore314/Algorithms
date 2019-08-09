package org.bridgelabz.oops.addressbook;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.Bridgelbz.programms.Utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class AddresssImplentation {
	String firstname;
	String lastname;
	String phonenumber;
	String city;
	String state;
	long pincode;
	List<Person> person = new ArrayList<Person>();
	Scanner scanner = Utility.getScanner();
	Person man;
	Address adress;
	WorkingWithJSon WorkingWithJSon=new WorkingWithJSon();
	public void addPerson(int num) throws JsonGenerationException, JsonMappingException, IOException {
		for (int i = 0; i < num; i++) {
			adress = new Address();
			man = new Person();
			System.out.println("enter  firstname");
			firstname = scanner.next();
			System.out.println("enter lastname");
			lastname = scanner.next();
			System.out.println("enter phonenumber");
			phonenumber = scanner.next();
			System.out.println("enter city");
			city = scanner.next();
			System.out.println("enter state");
			state = scanner.next();
			System.out.println("enter pincode");
			pincode = scanner.nextLong();
			man.setFirstname(firstname);
			man.setLastname(lastname);
			man.setPhonenumber(phonenumber);
			adress.setCity(city);
			adress.setState(state);
			adress.setPincode(pincode);
			man.setAddress(adress);
			person.add(man);

		}
		WorkingWithJSon.writeToJson(person);
	}

	public void display() {
		System.out.println(person);
	}

	public void sortBYLastName(List<Person> jsondata) {
		 Collections.sort(jsondata,Person.lastNameComparator);

	}
	public void sortBYPincode(List<Person> jsondata) {
		 Collections.sort(jsondata,Person.pincodeCompartaor);
	}
int number;
	public void editByFirstName(List<Person> person2) {
		System.out.println("enter thye first name u want to edit");
		String search=scanner.next();
		for(Person p:person2) {
			if(p.getFirstname().equals(search)) {
				System.out.println("1.To edit last name  2.To edit phone number \n+"
						+ "3. To edit  city 4. To edit  state  5.To edit  pincode");
				number=scanner.nextInt();
				switch(number) {
				case 1: System.out.println(" enter lastname to edit ");
					String lastname=scanner.next();
				       p.getAddress().setCity(lastname);
			            break;
				case 2: System.out.println(" enter phonenumber to edit ");
				String phonenumber=scanner.next();
			       p.getAddress().setCity(phonenumber);
		            break;
		            
				case 3: System.out.println(" enter city name to edit ");
					String city=scanner.next();
				       p.getAddress().setCity(city);
			            break;
			            
				case 4: System.out.println(" enter state name to edit ");
						String state=scanner.next();
					       p.getAddress().setCity(state);
				            break;
				            
				case 5: System.out.println(" enter pincode  to edit ");
							long pincode=scanner.nextLong();
						       p.getAddress().setPincode(pincode);
					            break;
				}
			}
		}
	}
	public List<Person> removeByFirstName(List<Person> person2) {
		System.out.println("enter thye firstname of person u want to remove");
		String search=scanner.next();
		for(int i=0;i<person2.size();i++) {
			if(((Person) person2).getFirstname().equals(search)) {
				person2.remove(i);
			}
			else {
				System.out.println(" No person with that name");
			}
		}
		return person2;
	}
}
