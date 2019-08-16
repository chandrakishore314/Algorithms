package com.bridgelabz.designpattern.computerfactory.main;

import com.bridgelabz.designpattern.computerfactory.abstractclass.Computer;

public class User {

	public static void main(String[] args) {


		Computer computer = ComputerFactory.getComputer("Laptop","2 GB","500 GB","2.4 GHz");

System.out.println(computer);


	}

}
