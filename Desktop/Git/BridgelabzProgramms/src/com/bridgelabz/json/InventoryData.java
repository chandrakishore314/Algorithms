package com.bridgelabz.json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryData {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
	      FileReader file = new FileReader("H:\\Bridgelbz\\BridgelabzProgramms\\src\\com\\bridgelabz\\json\\Inventory.json");
	        	Object obj =  parser.parse(file);
	        	 
	              JSONArray array = (JSONArray)obj;
	        	 for(int i=0;i<array.size();i++) {
	        		 JSONObject obj2 = (JSONObject)array.get(i);
	        		System.out.println("name is "+obj2.get("name")+" && "+ " value is "+obj2.get("price"));    
	        	 }
	}

}
