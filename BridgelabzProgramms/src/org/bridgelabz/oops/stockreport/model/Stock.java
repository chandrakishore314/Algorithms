package org.bridgelabz.oops.stockreport.model;

/**

 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */

public class Stock implements Comparable<Object> {
	private String stocknames;
	private int numberofshare;
	private double shareprice;
	
	public String getStocknames() {
		return stocknames;
	}
	public void setStocknames(String stocknames) {
		this.stocknames = stocknames;
	}
	public int getNumberofshare() {
		return numberofshare;
	}
	public void setNumberofshare(int numberofshare) {
		this.numberofshare = numberofshare;
	}
	public double getShareprice() {
		return shareprice;
	}
	public void setShareprice(double shareprice2) {
		this.shareprice = shareprice2;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
