package org.bridgelabz.oops.addressbook.workingwithjson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.oops.addressbook.model.Address;
import org.bridgelabz.oops.addressbook.model.Person;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class WorkingWithJSon {
	
	 JSONParser parser = new JSONParser();
	 JSONArray jsonArray=new JSONArray(); 
	 // To write to the json
	public void writeToJson(List<Person> persons) throws JsonGenerationException, JsonMappingException, IOException {
JSONObject json = new JSONObject();
		for(Person p:persons) {
			json = new JSONObject();
        json.put("firstname",p.getFirstname());
        json.put("lastname", p.getLastname());
        json.put("phonenumber", p.getPhonenumber());
        json.put("city", p.getAddress().getCity());
        json.put("state", p.getAddress().getState());
        json.put("pincode", p.getAddress().getPincode());
       jsonArray.add(json);
		}
try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/addressbook/workingwithjson/address.json")) {
    file.write(jsonArray.toJSONString());
    file.flush();
} catch (IOException e) {
    e.printStackTrace();
}	
		
	}
	 // To read from the json
	public List<Person> readInventoryData() throws JsonParseException, JsonMappingException, IOException {
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
				String lastname= (String) jobject.get("firstname");
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
		
	

	

	


