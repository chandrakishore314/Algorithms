package org.bridgelabz.oops.clinique.workingwithjson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.functional.utility.Utility;
import org.bridgelabz.oops.clinique.model.Availability;
import org.bridgelabz.oops.clinique.model.Doctor;
import org.bridgelabz.oops.clinique.model.Patient;
import org.bridgelabz.oops.inventory.model.Inventorry;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WorkingCliniqueJson {
	
	 JSONParser parser = new JSONParser();
	
	 
		
		public void writeToJson(List<Patient> patients) throws JsonGenerationException, JsonMappingException, IOException {
			JSONObject json = new JSONObject();
			 JSONArray pjsonArray=new JSONArray(); 
				
			for(Patient p:patients) {
				json = new JSONObject();
	        json.put("name",p.getName());
	        json.put("id", p.getId());
	        json.put("mobilenum", p.getMobilenum());
	        json.put("age", p.getAge());
	       pjsonArray.add(json);

			}
			
			try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/patient.json")) {

			    file.write(pjsonArray.toJSONString());
			    file.flush();

			} catch (IOException e) {
			    e.printStackTrace();
			}
		
			
		}

		public List<Patient> readPatientsData() throws JsonParseException, JsonMappingException, IOException {
			List<Patient> patients=new ArrayList<Patient>();
			JSONArray jsonArray = null;
				try {
					jsonArray = (JSONArray) parser.parse(new FileReader("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/patient.json"));
				}  catch (IOException | ParseException e) {
					e.printStackTrace();
					
				}
				if(jsonArray!=null) {
			for (Object obj : jsonArray) {
				Patient  patient =new Patient(); 
				JSONObject jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				patient.setName(name);
				int id=(int) jobject.get("id");
				patient.setId(id);
				String mobilenum=(String)jobject.get("mobilenum");
				patient.setMobilenum(mobilenum);
				int age=(int) jobject.get("age");
				patient.setAge(age);
				patients.add(patient);
				
			}}
			
		
		return patients;
		
		
	}
		public void writeTodJson(List<Doctor> doctor) throws JsonGenerationException, JsonMappingException, IOException {
			
			JSONObject json = new JSONObject();
			 JSONArray djsonArray=new JSONArray(); 
				
			for(Doctor d:doctor) {
				json = new JSONObject();
	        json.put("dname",d.getDname());
	        json.put("did", d.getDid());
	        json.put("specialisation", d.getSpecialisation());
	      djsonArray.add(json);

			}
			
			try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/doctor.json")) {

			    file.write(djsonArray.toJSONString());
			    file.flush();

			} catch (IOException e) {
			    e.printStackTrace();
			}
		
		
		}

		public List<Doctor> readDoctorsData() throws JsonParseException, JsonMappingException, IOException {
			

	List<Doctor> doctorslist=new ArrayList<Doctor>();
	JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/doctor.json"));
		}  catch (IOException | ParseException e) {
			e.printStackTrace();
			
		}
		if(jsonArray!=null) {
	for (Object obj : jsonArray) {
		Doctor doctor=new Doctor(); 
		JSONObject jobject = (JSONObject) obj;
		String dname = (String) jobject.get("name");
		doctor.setDname(dname);
		int did=(int) jobject.get("id");
		doctor.setDid(did);
		String specialisation=(String)jobject.get("specialisation");
		doctor.setSpecialisation(specialisation);
		doctorslist.add(doctor);
		
	}}
	

return doctorslist;
	}

		public void writeToAvailabilityJson(List<Availability> availability) throws JsonGenerationException, JsonMappingException, IOException {
			JSONObject json = new JSONObject();
			 JSONArray pjsonArray=new JSONArray(); 
				
			for(Availability a:availability) {
				json = new JSONObject();
	        json.put("patient",a.getPatient());
	        json.put("doctor", a.getDoctor());
	        json.put("date",a.getDate());
	       pjsonArray.add(json);

			}
			
			try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/availability.json")) {

			    file.write(pjsonArray.toJSONString());
			    file.flush();

			} catch (IOException e) {
			    e.printStackTrace();
			}
		
			
			
			
			
			
		}
			
		}

		


