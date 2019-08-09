/**
 * Date :07/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.stockreport;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.bridgelbz.programms.utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StocksList {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		Scanner scanner = Utility.getScanner();
		System.out.println("enter number of stocks to enter");
		StockAccountExtension stock = new StockAccountExtension();
		int num = scanner.nextInt();
		List<StockBean> stockObject = stock.addStocks(num);

		StockImplementation stockImplementation = new StockImplementation();
		stockImplementation.addToJson(stockObject);

		long totalprice = 0;
		List<StockBean> stockObjects = stockImplementation.readFromJson();
		for (StockBean stock1 : stockObjects) {
			long value = stock1.getShareprice() * stock1.getNumberofshare();
			System.out.println(stock1.getStocknames() + " " + value);
			totalprice = totalprice + value;
		}
		System.out.println("Total Stock Value  " + totalprice);
		int choice = 0;

		while (true) {
			System.out.println(" enter 1.To add new Account to File 2. To get value of any stock\n"
					                + "3. To Buy    4. To sell  5. To save to File  6. To print Stock Report"
					                + "7.Add the Transaction to json 8.. exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				stockObjects = stock.addStocks(1);
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
				stockImplementation.addToJson(stockObjects);
				break;
			case 7:
				stock.addTransactiontoJson();
				break;
			case 8:
				System.exit(0);
				break;
			default:
				System.out.println("enter valid between 0 - 7");
				break;
			}
		}
	}
}
