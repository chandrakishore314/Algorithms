package org.bridgelabz.oops.inventory.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.bridgelabz.oops.inventory.model.Inventorry;
import org.json.simple.parser.ParseException;

public interface Inventoryinterface {
	
	void writeToJson(List<Inventorry> inventories);
	List<Inventorry> readInventoryData() throws FileNotFoundException, IOException, ParseException;
}
