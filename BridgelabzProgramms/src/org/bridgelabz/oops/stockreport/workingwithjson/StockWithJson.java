package org.bridgelabz.oops.stockreport.workingwithjson;

/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.oops.stockreport.model.Stock;
import org.bridgelabz.oops.stockreport.model.Transaction;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;

public class StockWithJson {
	 JSONParser parser = new JSONParser();
		Gson gson=new Gson();
	public void addToJson(List<Stock> stockObject) throws  IOException {
		String jsonString = gson.toJson(stockObject);
		try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/json/stock.json")) {

		    file.write(jsonString);
		    file.flush();

		} catch (IOException e) { 
		    e.printStackTrace();
		}
	}

	// // To print  the stock list from json
	public List<Stock> readFromJson(){
		List<Stock> inventories=new ArrayList<Stock>();
	JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/json/stock.json"));
		}  catch (IOException | ParseException e) {
			e.printStackTrace();
			
		}
		if(jsonArray!=null) {
	for (Object obj : jsonArray) {
		Stock stock=new Stock();
		JSONObject jobject = (JSONObject) obj;
		String name = (String) jobject.get("name");
		stock.setStocknames(name);
		long numberofshares =(long) jobject.get("numberofshare");
		int numberofshare=(int)numberofshares;
		 stock.setNumberofshare( numberofshare);
		 double shareprice= (double) jobject.get("shareprice");
		 stock.setShareprice(shareprice);
		 inventories.add(stock);
	}}
	

return inventories;


	}
	
	 // To add the Transaction list to json
	public void addToJsonTransaction(List<Transaction> transactionObject) throws JsonGenerationException, JsonMappingException, IOException {

String transactionstring=gson.toJson(transactionObject);
		try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/jsontransaction.json")) {

		    file.write(transactionstring);
		    file.flush();

		} catch (IOException e) {
		    e.printStackTrace();
		}
			
	}

	
	 // To read the Transaction list from the json
	public List<Transaction> readFromJsonTransaction() throws JsonParseException, JsonMappingException, IOException {
List<Transaction> transactionlist=new ArrayList<Transaction>();
JSONArray jsonArray = null;
	try {
		jsonArray = (JSONArray) parser.parse(new FileReader(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/jsontransaction.json")));
	}  catch (IOException | ParseException e) {
		e.printStackTrace();
		
	}
	if(jsonArray!=null) {
for (Object obj : jsonArray) {
	Transaction transaction =new Transaction();
	JSONObject jobject = (JSONObject) obj;
	String transactiontype = (String) jobject.get("transactiontype");
	transaction.setTransactiontype(transactiontype);
	String stocknames= (String) jobject.get("stocknames");
	transaction.setStocknames(stocknames);
	int transactnumberofshare=(int) jobject.get("transactnumberofshare");
	transaction.setTransactnumberofshare(transactnumberofshare);
	String transactiondateime=(String) jobject.get("transactiondateime");
	transaction.setTransactiondateime(transactiondateime);
	
	
	
	
	transactionlist.add(transaction);
}}
	return transactionlist;
	}
	

}