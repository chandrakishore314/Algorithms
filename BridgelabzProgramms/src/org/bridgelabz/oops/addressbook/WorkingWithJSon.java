package org.bridgelabz.oops.addressbook;

/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.Bridgelbz.programms.Utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
 
public class WorkingWithJSon {
	ObjectMapper objectMapper=Utility.getObjectMapper();
	
	
	public void writeToJson(List<Person> persons) throws JsonGenerationException, JsonMappingException, IOException {
		objectMapper.writeValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/addressbook/address.json"), persons);
	}

	public List<Person> readInventoryData() throws JsonParseException, JsonMappingException, IOException {
		List<Person> jsondata= 
				objectMapper.readValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/addressbook/address.json"),new TypeReference<List<Person>>() {});
return jsondata;
	
}
		
	}

	

	


