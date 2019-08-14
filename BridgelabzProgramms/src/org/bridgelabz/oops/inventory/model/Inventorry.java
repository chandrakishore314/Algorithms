package org.bridgelabz.oops.inventory.model;

/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
	
public class Inventorry {
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getWeight() {
		return weight;
	}
	public void setWeight(long weight) {
		this.weight = weight;
	}
	private String name;
	private double price;
	private long weight;
	
	                                                                       
}
