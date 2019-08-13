package org.bridgelabz.oops.addressbook.model;

import java.util.Comparator;

import lombok.Getter;
import lombok.Setter;
@Getter@Setter
public class Person {
	String firstname;
	String lastname;
    String phonenumber;
    Address address;

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", phonenumber=" + phonenumber
				+ ", address=" + address + "]\n";
	}
	
	
	public static Comparator<Person> lastNameComparator  = new Comparator<Person>() {
		public int compare(Person person1, Person person2) {

System.out.println(person1.getLastname()+" "+person2.getLastname());
return (person1.getLastname()).compareTo(person2.getLastname());
}
};

public static Comparator<Person> pincodeCompartaor  = new Comparator<Person>() {
	public int compare(Person person1, Person person2) {

return (int) ((person1.getAddress().getPincode())-(person2.getAddress().getPincode()));
}
};
	
    
}