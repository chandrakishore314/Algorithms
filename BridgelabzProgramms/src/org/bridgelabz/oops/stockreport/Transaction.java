package org.bridgelabz.oops.stockreport;

public class Transaction {
	private String transactiontype;
	private String stocknames;
	private int transactnumberofshare;
	private String transactiondateime;
	
	public String getTransactiondateime() {
		return transactiondateime;
	}
	public void setTransactiondateime(String transactiondateime) {
		this.transactiondateime = transactiondateime;
	}
	public String getTransactiontype() {
		return transactiontype;
	}
	public void setTransactiontype(String transactiontype) {
		this.transactiontype = transactiontype;
	}
	public String getStocknames() {
		return stocknames;
	}
	public void setStocknames(String stocknames) {
		this.stocknames = stocknames;
	}
	public int getTransactnumberofshare() {
		return transactnumberofshare;
	}
	public void setTransactnumberofshare(int transactnumberofshare) {
		this.transactnumberofshare = transactnumberofshare;
	}
	
	

}
