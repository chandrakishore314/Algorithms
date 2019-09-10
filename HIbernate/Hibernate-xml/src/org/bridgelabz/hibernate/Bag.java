package org.bridgelabz.hibernate;
public class Bag {
	int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
String name;
int price;
public Bag() {}
public Bag(String name, int price) {
	super();
	this.name = name;
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
