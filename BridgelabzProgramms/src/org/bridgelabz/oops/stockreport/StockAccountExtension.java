/**
 * Date :07/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */package org.bridgelabz.oops.stockreport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.bridgelabz.programms.utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StockAccountExtension {
	String stocknames;
	int numberofshare;
	long shareprice;
	Scanner scanner = Utility.getScanner();

	List<Transaction> transactionObject = new ArrayList<Transaction>();
	StockImplementation stockImplementation = new StockImplementation();
	List<StockBean> stockObject = new ArrayList<StockBean>();
//Adding stock data 
	List<StockBean> addStocks(int num) {

		StockBean stockbean = new StockBean();
		for (int i = 0; i < num; i++) {
			System.out.println("enter stockNames");
			stocknames = scanner.next();

			System.out.println("enter numberofshare");
			numberofshare = scanner.nextInt();

			System.out.println("enter shareprice");
			shareprice = scanner.nextLong();

			stockbean.setStocknames(stocknames);
			stockbean.setNumberofshare(numberofshare);
			stockbean.setShareprice(shareprice);
			stockObject.add(stockbean);
			stockbean = new StockBean();
		}

		return stockObject;
	}

	public void valueOf(List<StockBean> stockObjects) {
		System.out.println(" enter stock name");
		stocknames = scanner.next();
		for (StockBean stock1 : stockObjects) {
			if ((stock1.getStocknames().equals(stocknames))) {
				System.out.println(stock1.getShareprice());
			}
		}

	}

	public void buyStock(List<StockBean> stockObjects)
			throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println(" enter stock name to buy");
		stocknames = scanner.next();
		Transaction transaction = new Transaction();
		for (StockBean stock2 : stockObjects) {
			if ((stock2.getStocknames().equals(stocknames))) {
				int value = stock2.getNumberofshare();
				System.out.println(" enter stock value buy");
				numberofshare = scanner.nextInt();
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

	public void sellStock(List<StockBean> stockObjects)
			throws JsonGenerationException, JsonMappingException, IOException {
		System.out.println(" enter stock name to buy");
		stocknames = scanner.next();
		Transaction transaction = new Transaction();
		for (StockBean stock2 : stockObjects) {
			if ((stock2.getStocknames().equals(stocknames))) {
				int value = stock2.getNumberofshare();
				System.out.println(" enter stock value sell");
				numberofshare = scanner.nextInt();
				value =value -numberofshare;
				stock2.setNumberofshare(value);
				transaction.setTransactnumberofshare(value);
				transaction.setTransactiontype("sell ");
				transaction.setStocknames(stocknames);
				transaction.setTransactiondateime(new Date().toString());
			}
			transactionObject.add(transaction);
		}
		
	}

	public void addTransactiontoJson() throws JsonGenerationException, JsonMappingException, IOException {
		stockImplementation.addToJsonTransaction(transactionObject);
	}
	
	

}
