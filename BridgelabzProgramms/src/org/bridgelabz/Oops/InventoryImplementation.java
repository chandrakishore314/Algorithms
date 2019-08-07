/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.Oops;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.Bridgelbz.programms.Utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
 
public class InventoryImplementation {
	ObjectMapper objectMapper=Utility.getObjectMapper();
	
	
	public void writeToJson(List<Inventorry> inventories) throws JsonGenerationException, JsonMappingException, IOException {
		objectMapper.writeValue(new File("H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\Oops\\Inventory.json"), inventories);
	}

	public List<Inventorry> readInventoryData() throws JsonParseException, JsonMappingException, IOException {
		List<Inventorry> inventorry= 
				objectMapper.readValue(new File("H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\Oops\\Inventory.json"),new TypeReference<List<Inventorry>>() {});
return inventorry;
	
}
		
	}

	

	


