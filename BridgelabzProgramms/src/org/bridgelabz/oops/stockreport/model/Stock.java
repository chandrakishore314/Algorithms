package org.bridgelabz.oops.stockreport.model;

import lombok.Getter;
import lombok.Setter;

/**

 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
@Getter@Setter
public class Stock implements Comparable<Object> {
	String stocknames;
	int numberofshare;
	double shareprice;
	
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	

}
