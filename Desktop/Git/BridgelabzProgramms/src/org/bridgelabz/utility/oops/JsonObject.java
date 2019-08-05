package org.bridgelabz.utility.oops;

import java.io.File;
import java.io.IOException;

import org.bridgelabz.Oops.Inventorry;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonObject {
	private static ObjectMapper mapper;
	static {
		mapper=new ObjectMapper();
	}
	public static  String convertJavaToJson(Object obj) {
		String jsonResult=" ";
		try {
			jsonResult=mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return jsonResult;
		
	}
	public static <T> T convertJsonToJava (File file,Class<T> class1) {
		T result=null;
		try {
			result=mapper.readValue(file, class1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	

}
