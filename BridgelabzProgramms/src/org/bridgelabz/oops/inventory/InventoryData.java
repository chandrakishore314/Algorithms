/**
 * Date :06/08/2019
 * @author  Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.inventory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bridgelabz.functional.utility.Utility;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class InventoryData {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		List<Inventorry> inventories = new ArrayList<Inventorry>();
		Scanner scanner = Utility.getScanner();
		System.out.println("enter number of inventories");
		int num = scanner.nextInt();
		InventoryImplementation inventaryImp = new InventoryImplementation();
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
		List<Inventorry> jsonInventories = inventaryImp.readInventoryData();
		ObjectMapper mapper = Utility.getObjectMapper();

		for (Inventorry inventories1 : jsonInventories) {
			String jsonString = mapper.writeValueAsString(inventories1);
			System.out.println(jsonString);
long value=(long) (inventories1.getWeight()*inventories1.getPrice());
			System.out.println(inventories1.getName() + " inventory value is " + value);
			totalValue = (totalValue + value);
		}

		System.out.println("Total Stock value is " + totalValue);

	}
}