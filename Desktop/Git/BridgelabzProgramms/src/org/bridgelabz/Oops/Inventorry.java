package org.bridgelabz.Oops;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonIgnoreProperties
public class Inventorry {
	

	ArrayList<Rice> Rice;
    ArrayList<String> Wheat;
    ArrayList<String> Perals;
	/*private String name;
	private int weight;
	private int price; 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}*/
	public ArrayList<org.bridgelabz.Oops.Rice> getRice() {
		return Rice;
	}
	public void setRice(ArrayList<org.bridgelabz.Oops.Rice> rice) {
		Rice = rice;
	}
	public ArrayList<String> getWheat() {
		return Wheat;
	}
	public void setWheat(ArrayList<String> wheat) {
		Wheat = wheat;
	}
	public ArrayList<String> getPerals() {
		return Perals;
	}
	public void setPerals(ArrayList<String> perals) {
		Perals = perals;
	}


}
