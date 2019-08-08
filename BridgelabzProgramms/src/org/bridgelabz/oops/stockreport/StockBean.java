/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.stockreport;

public class StockBean implements Comparable  {
	private String stocknames;
	private int numberofshare;
	private long shareprice;
	
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
	public long getShareprice() {
		return shareprice;
	}
	public void setShareprice(long shareprice) {
		this.shareprice = shareprice;
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
