/**
 * Date :06/08/2019
 * created: Chandra Kishore
 * version :
 * modified
 * */
package org.bridgelabz.oops.stockreport;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.Bridgelbz.programms.Utility.Utility;
import org.bridgelabz.oops.Inventorry;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockImplementation {
	ObjectMapper mapper=Utility.getObjectMapper();
	public void addToJson(List<StockBean> stockObject) throws JsonGenerationException, JsonMappingException, IOException {
	
		mapper.writeValue(new File("H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\oops\\stockreport\\stock.json"), stockObject);
	}

	public List<StockBean> readFromJson() throws JsonParseException, JsonMappingException, IOException {
	List<StockBean> list=mapper.readValue(new File("H:\\Bridgelbz\\BridgelabzProgramms\\src\\org\\bridgelabz\\oops\\stockreport\\stock.json"),new TypeReference<List<StockBean>>() {} );
		
	return list;
	}
	

}
