package org.bridgelabz.Oops;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectReader;
import org.codehaus.jackson.type.TypeReference;

public class InventoryData {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException  {
		ObjectMapper mapper=new ObjectMapper();
		int totalValue = 0;
		
	
	
		
	
		List<Object> obj= mapper.readValue(new File("H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\Oops\\Inventory.json"),new TypeReference<List<Object>>(){});
	
		System.out.println(obj);
		
	}}