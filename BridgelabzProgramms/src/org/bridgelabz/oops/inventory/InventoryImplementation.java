/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.inventory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.bridgelabz.functional.utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
 
public class InventoryImplementation {
	ObjectMapper objectMapper=Utility.getObjectMapper();
	
	
	public void writeToJson(List<Inventorry> inventories) throws JsonGenerationException, JsonMappingException, IOException {
		File file=	new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/inventory/Inventory.json");
		 FileWriter fw = new FileWriter(file);
		objectMapper.writeValue(fw, inventories);
	}

	
	public List<Inventorry> readInventoryData() throws JsonParseException, JsonMappingException, IOException {
		List<Inventorry> inventorry= 
				objectMapper.readValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/inventory/Inventory.json"),new TypeReference<List<Inventorry>>() {});
return inventorry;
	
}
		
	}

	

	


