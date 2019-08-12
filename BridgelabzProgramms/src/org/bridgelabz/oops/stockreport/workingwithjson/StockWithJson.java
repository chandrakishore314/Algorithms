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

public class StockWithJson {
	 JSONParser parser = new JSONParser();
	 JSONArray jsonArray=new JSONArray(); 
	 JSONObject json = new JSONObject();
	public void addToJson(List<Stock> stockObject) throws JsonGenerationException, JsonMappingException, IOException {
		for(Stock s:stockObject) {
			json = new JSONObject();
        json.put("stocknames",s.getStocknames());
        json.put("numberofshare", s.getNumberofshare());
        json.put("shareprice", s.getShareprice());
       jsonArray.add(json);

		}
		try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/stock.json")) {

		    file.write(jsonArray.toJSONString());
		    file.flush();

		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

	public List<Stock> readFromJson(){
		List<Stock> inventories=new ArrayList<Stock>();
	JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/stock.json"));
		}  catch (IOException | ParseException e) {
			e.printStackTrace();
			
		}
		if(jsonArray!=null) {
	for (Object obj : jsonArray) {
		Stock stock=new Stock();
		JSONObject jobject = (JSONObject) obj;
		String name = (String) jobject.get("name");
		stock.setStocknames(name);
		int numberofshare =(int) jobject.get(" numberofshare");
		 stock.setNumberofshare( numberofshare);
		 double shareprice=(Double) jobject.get("shareprice");
		 stock.setShareprice(shareprice);
		 inventories.add(stock);
	}}
	

return inventories;


	}
	public void addToJsonTransaction(List<Transaction> transactionObject) throws JsonGenerationException, JsonMappingException, IOException {
JSONObject tjson ;
JSONArray tjsonArray=new JSONArray(); 
		for(Transaction i:transactionObject) {
			tjson = new JSONObject();
        tjson.put("transactiontype", i.getTransactiontype());
        tjson.put("stocknames", i.getStocknames());
        tjson.put("transactnumberofshare", i.getTransactnumberofshare());
       tjsonArray.add(tjson);

		}
		try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/jsontransaction.json")) {

		    file.write(tjsonArray.toJSONString());
		    file.flush();

		} catch (IOException e) {
		    e.printStackTrace();
		}
			
	}

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