/**
 * Date :07/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.stockreport.model;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Transaction {
	private String transactiontype;
	private String stocknames;
	private int transactnumberofshare;
	private String transactiondateime;
}
