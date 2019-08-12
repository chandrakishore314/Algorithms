package org.bridgelabz.oops.inventory.main;
/**
 * Date :06/08/2019
 * @author  Chandra Kishore
 * version :
 * modified
 * */

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bridgelabz.functional.utility.Utility;
import org.bridgelabz.oops.inventory.interfaces.Inventoryinterface;
import org.bridgelabz.oops.inventory.model.Inventorry;
import org.bridgelabz.oops.inventory.workingwithjson.InventoryImplementation;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

import org.json.simple.parser.ParseException;

public class InventoryData {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, ParseException {
		Inventoryinterface inventaryImp = new InventoryImplementation();
	//	List<Inventorry> inventories=new ArrayList<Inventorry>();
		List<Inventorry> inventories = inventaryImp.readInventoryData();
		Scanner scanner = Utility.getScanner();
		System.out.println("enter number of inventories");
		int num = scanner.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("enter name ");
			String name = scanner.next();
			System.out.println("enter weight ");
			long weight = scanner.nextLong();
			System.out.println("enter price ");

			long price = scanner.nextLong();
			Inventorry inventorry = new Inventorry();
			inventorry.setName(name);
			inventorry.setWeight(weight);
			inventorry.setPrice(price);
			inventories.add(inventorry);

		}
		inventaryImp.writeToJson(inventories);
		long totalValue = 0;

		inventories = inventaryImp.readInventoryData();
		

		for (Inventorry inventories1 : inventories) {
			String jsonString = inventories1.getName();
			System.out.println(jsonString);
			long value = (long) (inventories1.getWeight() * inventories1.getPrice());
			System.out.println(inventories1.getName() + " inventory value is " + value);
			totalValue = (totalValue + value);
		}

		System.out.println("Total Stock value is " + totalValue);

	}
}