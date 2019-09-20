package org.bridgelabz.oops.inventory.main;
/**
 * Date :06/08/2019
 * @author  Chandra Kishore
 * version :
 * modified
 * */

import java.io.IOException;

import org.bridgelabz.oops.inventory.interfaces.Inventoryinterface;
import org.bridgelabz.oops.inventory.workingwithjson.InventoryImplementation;
import org.bridgelabz.programms.utility.InputScanner;
import org.json.simple.parser.ParseException;

public class InventoryData {

	public static void main(String[] args) throws IOException, ParseException {
		Inventoryinterface inventaryImp = new InventoryImplementation();
		int num = 5, choice = 1;

		do {
			System.out.println("1.To add the Inventory Data  2.To calculate Stock Value 3.To exit");
			num = InputScanner.getInt();
			switch (num) {
			case 1:
				inventaryImp.add();
				break;
			case 2:
				inventaryImp.printStcokValue();
				break;
			case 3:
				choice = 2;
				break;
			default:
				System.out.println(" enter any valid chioce betwwen 1 - 3");
				break;
			}
		} while (choice == 1);

	}
}