package org.bridgelabz.oops.addressbook.interfacesimpl;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.bridgelabz.oops.addressbook.interfaces.AdressFunctions;
import org.bridgelabz.oops.addressbook.model.Address;
import org.bridgelabz.oops.addressbook.model.Person;
import org.bridgelabz.programms.utility.InputScanner;;

public class AddresssImplentation implements AdressFunctions {
	String firstname;
	String lastname;
	String phonenumber;
	String city;
	String state;
	long pincode;

	Person man;
	Address adress;
	org.bridgelabz.oops.addressbook.workingwithjson.WorkingWithJSon WorkingWithJSon = new org.bridgelabz.oops.addressbook.workingwithjson.WorkingWithJSon();

	public void addPerson(List<Person> jsondata, int num) {
		for (int i = 0; i < num; i++) {
			adress = new Address();
			man = new Person();
			System.out.println("enter  firstname");
			firstname = InputScanner.getString();
			System.out.println("enter lastname");
			lastname = InputScanner.getString();
			System.out.println("enter phonenumber");
			phonenumber = InputScanner.getString();
			System.out.println("enter city");
			city = InputScanner.getString();
			System.out.println("enter state");
			state = InputScanner.getString();
			System.out.println("enter pincode");
			pincode = InputScanner.getLong();
			man.setFirstname(firstname);
			man.setLastname(lastname);
			man.setPhonenumber(phonenumber);
			adress.setCity(city);
			adress.setState(state);
			adress.setPincode(pincode);
			man.setAddress(adress);
			jsondata.add(man);

		}
		try {
			WorkingWithJSon.writeToJson(jsondata);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void display(List<Person> jsondata) {
		System.out.println(jsondata);
	}

	public void sortBYLastName(List<Person> jsondata) {
		Collections.sort(jsondata, Person.lastNameComparator);

	}

	public void sortBYPincode(List<Person> jsondata) {
		Collections.sort(jsondata, Person.pincodeCompartaor);
	}

	int number;

	public void editByFirstName(List<Person> person2) {
		System.out.println("enter the first name u want to edit");
		String search = InputScanner.getString();
		for (Person p : person2) {
			if (p.getFirstname().equals(search)) {
				System.out.println("1.To edit last name  2.To edit phone number \n+"
						+ "3. To edit  city 4. To edit  state  5.To edit  pincode");
				number = InputScanner.getInt();
				switch (number) {
				case 1:
					System.out.println(" enter lastname to edit ");
					String lastname = InputScanner.getString();
					p.getAddress().setCity(lastname);
					break;
				case 2:
					System.out.println(" enter phonenumber to edit ");
					String phonenumber = InputScanner.getString();
					p.getAddress().setCity(phonenumber);
					break;

				case 3:
					System.out.println(" enter city name to edit ");
					String city = InputScanner.getString();
					p.getAddress().setCity(city);
					break;

				case 4:
					System.out.println(" enter state name to edit ");
					String state = InputScanner.getString();
					p.getAddress().setCity(state);
					break;

				case 5:
					System.out.println(" enter pincode  to edit ");
					long pincode = InputScanner.getLong();
					p.getAddress().setPincode(pincode);
					break;
				}
			}
		}
	}

	public List<Person> removeByFirstName(List<Person> person2) {
		System.out.println("enter thye firstname of person u want to remove");
		String search = InputScanner.getString();
		for (int i = 0; i < person2.size(); i++) {
			if (((Person) person2).getFirstname().equals(search)) {
				person2.remove(i);
			} else {
				System.out.println(" No person with that name");
			}
		}
		return person2;
	}

}
