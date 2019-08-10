package org.bridgelabz.oops.addressbook;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public interface AdressFunctions {
	void sortBYLastName(List<Person> jsondata);
	void sortBYPincode(List<Person> jsondata);
	void addPerson(List<Person> jsondata, int num) throws JsonGenerationException, JsonMappingException, IOException;
	void display(List<Person> jsondata);
	void editByFirstName(List<Person> person2);
	 List<Person> removeByFirstName(List<Person> person2) ;
}
