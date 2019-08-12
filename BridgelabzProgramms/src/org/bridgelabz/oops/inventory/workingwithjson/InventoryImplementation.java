/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.inventory.workingwithjson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.oops.inventory.interfaces.Inventoryinterface;
import org.bridgelabz.oops.inventory.model.Inventorry;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class InventoryImplementation implements Inventoryinterface {
	 JSONParser parser = new JSONParser();
	 JSONArray jsonArray=new JSONArray(); 
	
	public void writeToJson(List<Inventorry> inventories) {
		JSONObject json = new JSONObject();
		
		for(Inventorry i:inventories) {
			json = new JSONObject();
        json.put("name",i.getName());
        json.put("weight", i.getWeight());
        json.put("price", i.getPrice());
       jsonArray.add(json);

		}

try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/inventory/workingwithjson/inventory.json")) {

    file.write(jsonArray.toJSONString());
    file.flush();

} catch (IOException e) {
    e.printStackTrace();
}
		 
	}

	public List<Inventorry> readInventoryData() {
		List<Inventorry> inventories=new ArrayList<Inventorry>();
			JSONArray jsonArray = null;
				try {
					jsonArray = (JSONArray) parser.parse(new FileReader("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/inventory/workingwithjson/inventory.json"));
				}  catch (IOException | ParseException e) {
					e.printStackTrace();
					
				}
				if(jsonArray!=null) {
			for (Object obj : jsonArray) {
				Inventorry inventorry =new Inventorry();
				JSONObject jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				inventorry.setName(name);
				 long Weight=(long) jobject.get("weight");
				 inventorry.setWeight(Weight);
				 double Price=(Double) jobject.get("price");
				 inventorry.setPrice(Price);
				 inventories.add(inventorry);
			}}
			
		
		return inventories;
		
	}

}

	


