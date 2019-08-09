/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.inventory;

public class Inventorry {
	private String Name;
	private double Price;
	private long Weight;
	private Inventorry inventorry;
	public String getName() {
		return Name;
	}
	public Inventorry getInventorry() {
		return inventorry;
	}
	public void setInventorry(Inventorry inventorry) {
		this.inventorry = inventorry;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(long price2) {
		Price = price2;
	}
	public long getWeight() {
		return Weight;
	}
	public void setWeight(long weight2) {
		Weight = weight2;
	}
}
