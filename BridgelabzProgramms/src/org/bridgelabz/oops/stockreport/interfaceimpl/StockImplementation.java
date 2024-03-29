package org.bridgelabz.oops.stockreport.interfaceimpl;

/**
 * Date :07/08/2019
 * created: Chandra Kishore
 * version :
 * modified
*/
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.bridgelabz.oops.stockreport.interfaces.StockInterfaces;
import org.bridgelabz.oops.stockreport.model.Stock;
import org.bridgelabz.oops.stockreport.model.Transaction;
import org.bridgelabz.oops.stockreport.workingwithjson.StockWithJson;
import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;

public class StockImplementation implements StockInterfaces {
	String stocknames;
	int numberofshare;
	long shareprice;
	StockWithJson stockWithJson = new StockWithJson();

	List<Transaction> transactionObject = new ArrayList<Transaction>();

//Adding stock data 
	public List<Stock> addStocks(int num, List<Stock> stockObjects) {

		Stock stockbean = new Stock();
		for (int i = 0; i < num; i++) {
			System.out.println("enter stockNames");
			stocknames = InputScanner.getString();

			System.out.println("enter numberofshare");
			numberofshare = InputScanner.getInt();

			System.out.println("enter shareprice");
			shareprice = InputScanner.getInt();
			stockbean.setStocknames(stocknames);
			stockbean.setNumberofshare(numberofshare);
			stockbean.setShareprice(shareprice);
			stockObjects.add(stockbean);
			stockbean = new Stock();
		}

		return stockObjects;
	}

	public void valueOf(List<Stock> stockObjects) {
		System.out.println(" enter stock name");
		stocknames = InputScanner.getString();
		for (Stock stock1 : stockObjects) {
			if ((stock1.getStocknames().equals(stocknames))) {
				System.out.println(stock1.getShareprice());
			}
		}

	}

	public void buyStock(List<Stock> stockObjects) {
		System.out.println(" enter stock name to buy");
		stocknames = InputScanner.getString();
		Transaction transaction = new Transaction();
		for (Stock stock2 : stockObjects) {
			if ((stock2.getStocknames().equals(stocknames))) {
				int value = stock2.getNumberofshare();
				System.out.println(" enter stock value buy");
				numberofshare = InputScanner.getInt();
				value = value + numberofshare;
				stock2.setNumberofshare(value);
				transaction.setTransactnumberofshare(value);
				transaction.setTransactiontype("Buy ");
				transaction.setStocknames(stocknames);
				transaction.setTransactiondateime(new Date().toString());
			}
			transactionObject.add(transaction);
		}

	}

	public void sellStock(List<Stock> stockObjects) {
		System.out.println(" enter stock name to buy");
		stocknames = InputScanner.getString();
		Transaction transaction = new Transaction();
		for (Stock stock2 : stockObjects) {
			if ((stock2.getStocknames().equals(stocknames))) {
				int value = stock2.getNumberofshare();
				System.out.println(" enter stock value sell");
				numberofshare = InputScanner.getInt();
				value = value - numberofshare;
				stock2.setNumberofshare(value);
				transaction.setTransactnumberofshare(value);
				transaction.setTransactiontype("sell ");
				transaction.setStocknames(stocknames);
				transaction.setTransactiondateime(new Date().toString());
			}
			transactionObject.add(transaction);
		}

	}

	public void addTransactiontoJson() {
		try {
			stockWithJson.addToJsonTransaction(transactionObject);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
