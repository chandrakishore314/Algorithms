package org.bridgelabz.oops.stockreport.interfaces;

import java.util.List;

import org.bridgelabz.oops.stockreport.model.Stock;

public interface StockInterfaces {
	
	
	List<Stock> addStocks(int num,List<Stock> stockObjects);
	
	void valueOf(List<Stock> stockObjects);
	 void buyStock(List<Stock> stockObjects);
	void sellStock(List<Stock> stockObjects);
	
	void addTransactiontoJson();

}
