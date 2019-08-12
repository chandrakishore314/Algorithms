package org.bridgelabz.oops.stockreport.main;
/**
 * Date :07/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.bridgelabz.functional.utility.Utility;
import org.bridgelabz.oops.stockreport.interfaceimpl.StockImplementation;
import org.bridgelabz.oops.stockreport.interfaces.StockInterfaces;
import org.bridgelabz.oops.stockreport.model.Stock;
import org.bridgelabz.oops.stockreport.workingwithjson.StockWithJson;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockList {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Scanner scanner = Utility.getScanner();
		StockInterfaces  stock = new StockImplementation();
	
		

		StockWithJson stockWithJson = new StockWithJson();
		

		double totalprice = 0;
		List<Stock> stockObjects = stockWithJson.readFromJson();
		for (Stock stock1 : stockObjects) {
			double value = stock1.getShareprice() * stock1.getNumberofshare();
			System.out.println(stock1.getStocknames() + " " + value);
			totalprice = totalprice + value;
		}
		System.out.println("Total Stock Value  " + totalprice);
		int choice = 0,choice1 = 10;
do {
			System.out.println(" enter 1.To add new Account to File 2. To get value of any stock\n"
					                + "3. To Buy    4. To sell  5. To save to File  6. To print Stock Report"
					                + "7.Add the Transaction to json 8.. exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				stockObjects = stock.addStocks(1,stockObjects);
				break;
			case 2:
				stock.valueOf(stockObjects);
				break;
			case 3:
				stock.buyStock(stockObjects);
				break;
			case 4:
				stock.sellStock(stockObjects);
				break;
			case 5:
				stockWithJson.addToJson(stockObjects);
				break;
			case 7:
				stock.addTransactiontoJson();
				break;
			case 8:
				choice1=0;
				break;
			default:
				System.out.println("enter valid between 0 - 7");
				break;
			}
		}while(choice1==10);
	}
}
