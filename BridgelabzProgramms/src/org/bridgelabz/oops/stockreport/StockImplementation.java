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

import org.bridgelabz.functional.utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class StockImplementation {
	ObjectMapper mapper=Utility.getObjectMapper();
	public void addToJson(List<StockBean> stockObject) throws JsonGenerationException, JsonMappingException, IOException {
	
		mapper.writeValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/stock.json"), stockObject);
	}

	public List<StockBean> readFromJson() throws JsonParseException, JsonMappingException, IOException {
	List<StockBean> list=mapper.readValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/stock.json"),new TypeReference<List<StockBean>>() {} );
		
	return list;
	}
	public void addToJsonTransaction(List<Transaction> transactionObject) throws JsonGenerationException, JsonMappingException, IOException {
		
		mapper.writeValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/jsontransaction.json"), transactionObject);
	}

	public List<Transaction> readFromJsonTransaction() throws JsonParseException, JsonMappingException, IOException {
	List<Transaction> list=mapper.readValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/stockreport/jsontransaction.json"),new TypeReference<List<Transaction>>() {} );
		
	return list;
	}
	

}
