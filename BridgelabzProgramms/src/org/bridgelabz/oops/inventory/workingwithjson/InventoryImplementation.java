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
import org.bridgelabz.programms.utility.InputScanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

public class InventoryImplementation implements Inventoryinterface {
	
	public void add() {
		List<Inventorry> inventories = readInventoryData();
		System.out.println(" enter number of inventories to enter");
		int num=InputScanner.getInt();
		
		for (int i = 0; i < num; i++) {
			System.out.println("enter name ");
			String name = InputScanner.getString();
			System.out.println("enter weight ");
			long weight = InputScanner.getInt();
			System.out.println("enter price ");
			long price = InputScanner.getLong();
			Inventorry inventorry = new Inventorry();
			inventorry.setName(name);
			inventorry.setWeight(weight);
			inventorry.setPrice(price);
			inventories.add(inventorry);
		}
		writeToJson(inventories);
	}

	public void printStcokValue() {
		List<Inventorry> inventories = readInventoryData();
		long totalValue = 0;

		inventories = readInventoryData();
		

		for (Inventorry inventories1 : inventories) {
			String jsonString = inventories1.getName();
			System.out.println(jsonString);
			long value = (long) (inventories1.getWeight() * inventories1.getPrice());
			System.out.println(inventories1.getName() + " inventory value is " + value);
			totalValue = (totalValue + value);
		}

		System.out.println("Total Stock value is " + totalValue);
		
	}
	JSONParser parser = new JSONParser();
	JSONArray jsonArray = new JSONArray();

	public void writeToJson(List<Inventorry> inventories) {
		Gson gson = new Gson();

		String jsonString = gson.toJson(inventories);
		try {

			FileWriter fileWriter = new FileWriter(
					"/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/inventory/workingwithjson/inventory.json");
			fileWriter.write(jsonString);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public List<Inventorry> readInventoryData() {
		List<Inventorry> inventories = new ArrayList<Inventorry>();
		JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/inventory/workingwithjson/inventory.json"));
		} catch (IOException | ParseException e) {
			e.printStackTrace();

		}
		if (jsonArray != null) {
			for (Object obj : jsonArray) {
				Inventorry inventorry = new Inventorry();
				JSONObject jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				inventorry.setName(name);
				long Weight = (long) jobject.get("weight");
				inventorry.setWeight(Weight);
				double Price = (Double) jobject.get("price");
				inventorry.setPrice(Price);
				inventories.add(inventorry);
			}
		}

		return inventories;

	}

}
