/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.stockreport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.Bridgelbz.programms.Utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class StocksList {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		 String stocknames;
		 int numberofshare;
		 long shareprice;
		 
		 List<StockBean> stockObject=new ArrayList<StockBean>();
		 Scanner scanner=Utility.getScanner();
		 System.out.println("enter number of stocks to enter");
		 int number=scanner.nextInt();
		 StockBean  stockbean=new  StockBean();
		 for(int i=0;i<number;i++) {
			 System.out.println("enter stockNames");
			 stocknames=scanner.next();
			
			 System.out.println("enter numberofshare");
			 numberofshare=scanner.nextInt();
			
			 System.out.println("enter shareprice");
			 shareprice=scanner.nextLong();
			 
			 stockbean.setStocknames(stocknames);
			 stockbean.setNumberofshare(numberofshare);
			 stockbean.setShareprice(shareprice);
			 stockObject.add(stockbean);			
		 }
		 StockImplementation stockImplementation=new StockImplementation();
		 stockImplementation.addToJson(stockObject);
		 
		 long totalprice=0;
		 List<StockBean> stockObjects= stockImplementation.readFromJson();
		 for(StockBean stock:stockObjects) {
			 System.out.println(stock.getStocknames()+" "+stock.getShareprice());
			 totalprice=totalprice+stock.getShareprice();
			 
		 }
		 System.out.println("Total Stock Value"+totalprice);
	}
	
}
