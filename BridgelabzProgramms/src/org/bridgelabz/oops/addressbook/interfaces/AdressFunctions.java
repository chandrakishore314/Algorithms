package org.bridgelabz.oops.addressbook.interfaces;


	import java.io.IOException;
	import java.util.List;
	import org.bridgelabz.oops.addressbook.model.Person;
	import org.codehaus.jackson.JsonGenerationException;
	import org.codehaus.jackson.map.JsonMappingException;

	public interface AdressFunctions {
		abstract void sortBYLastName(List<Person> jsondata);
		abstract void sortBYPincode(List<Person> jsondata);
		abstract void addPerson(List<Person> jsondata, int num);
		abstract void display(List<Person> jsondata);
		abstract void editByFirstName(List<Person> person2);
		 List<Person> removeByFirstName(List<Person> person2) ;
	}


