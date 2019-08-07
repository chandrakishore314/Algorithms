package org.bridgelabz.oops.addressbook;

import java.util.Comparator;

public class Person {
	String firstname;
	String lastname;
    String phonenumber;
    Address address;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
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
