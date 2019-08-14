package org.bridgelabz.oops.addressbook.workingwithjson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.oops.addressbook.model.Address;
import org.bridgelabz.oops.addressbook.model.Person;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
public class WorkingWithJSon {
	
	 JSONParser parser = new JSONParser();
	 Gson gson=new Gson();
	 // To write to the json
	public void writeToJson(List<Person> persons) throws IOException {
String personsting=gson.toJson(persons);

try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/addressbook/workingwithjson/address.json")) {
    file.write(personsting);
    file.flush();
} catch (IOException e) {
    e.printStackTrace();
}	
		
	}
	 // To read from the json
	public List<Person> readInventoryData() throws IOException {
		List<Person> jsondata= new ArrayList<Person>();
		JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/addressbook/workingwithjson/address.json"));
		}  catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		if(jsonArray!=null) {
			for (Object obj : jsonArray) {
				Person person=new Person();
				Address address =new Address();
				JSONObject jobject = (JSONObject) obj;
				
				String firstname= (String) jobject.get("firstname");
				person.setFirstname(firstname); 
				String lastname= (String) jobject.get("lastname");
				person.setLastname(lastname);
				String phonenumber=(String) jobject.get("phonenumber");
				person.setPhonenumber(phonenumber);
				String city=(String) jobject.get("city");
				address.setCity(city);
				String state=(String)jobject.get("state");
				address.setState(state);
				long pincode=(long)jobject.get("pincode");
				address.setPincode(pincode);
				person.setAddress(address);
				jsondata.add(person);
			}}
		return jsondata;
	}
}
		
	

	

	


