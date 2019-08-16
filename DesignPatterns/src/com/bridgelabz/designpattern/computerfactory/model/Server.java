package com.bridgelabz.designpattern.computerfactory.model;

import com.bridgelabz.designpattern.computerfactory.abstractclass.Computer;

public class Server extends Computer {
	String ram;
	String hdd;
	String cpu;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getHdd() {
		return hdd;
	}
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
}
