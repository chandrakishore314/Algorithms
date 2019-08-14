package org.bridgelabz.oops.inventory.interfaces;

import java.util.List;

import org.bridgelabz.oops.inventory.model.Inventorry;

public interface Inventoryinterface {
	
	
	void writeToJson(List<Inventorry> inventories);
	List<Inventorry> readInventoryData() ;
	void printStcokValue();
	void add();
}
