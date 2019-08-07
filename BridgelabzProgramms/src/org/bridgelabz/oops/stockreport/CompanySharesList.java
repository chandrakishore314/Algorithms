package org.bridgelabz.oops.stockreport;

import java.util.Scanner;

import org.Bridgelbz.programms.Utility.Utility;
import org.Bridgelbz.programms.Utility.dataStructures.LinkedList;

public class CompanySharesList {
	public static void main(String[] args) {
		 String stocknames;
		 int numberofshare;
		 long shareprice;
		 
		 LinkedList<StockBean> stockObject=new LinkedList<StockBean >();
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
			 stockObject.append(stockbean);			
		 }
		 stockObject.printLinkedList();
		 System.out.println(stockObject);
		 
	}

}
