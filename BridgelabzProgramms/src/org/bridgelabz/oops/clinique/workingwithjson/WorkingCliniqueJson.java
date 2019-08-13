package org.bridgelabz.oops.clinique.workingwithjson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.oops.addressbook.model.Person;
import org.bridgelabz.oops.clinique.model.Availability;
import org.bridgelabz.oops.clinique.model.Doctor;
import org.bridgelabz.oops.clinique.model.Patient;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class WorkingCliniqueJson {
	
	 JSONParser parser = new JSONParser();
	
	 
		// To write Patient object to json File
		public void writeToJson(List<Patient> patients) throws JsonGenerationException, JsonMappingException, IOException {
			JSONObject pjson = new JSONObject();
			 JSONArray pjsonArray=new JSONArray(); 
				
			for(Patient p:patients) {
				pjson = new JSONObject();
	        pjson.put("name",p.getName());
	        pjson.put("id", p.getId());
	        pjson.put("mobilenum", p.getMobilenum());
	        pjson.put("age", p.getAge());
	       pjsonArray.add(pjson);

			}
			
			try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/patient.json")) {

			    file.write(pjsonArray.toJSONString());
			    file.flush();

			} catch (IOException e) {
			    e.printStackTrace();
			}
		
			
		}
		// To read Patient object from json File
		public List<Patient> readPatientsData() throws JsonParseException, JsonMappingException, IOException {
			List<Patient> patients=new ArrayList<Patient>();
			JSONArray jsonArray = null;
				try {
					jsonArray = (JSONArray) parser.parse(new FileReader("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/patient.json"));
				}  catch (IOException | ParseException e) {
					e.printStackTrace();
					
				}
				if(jsonArray!=null) {
			for (Object obj : jsonArray) {
				Patient  patient =new Patient(); 
				JSONObject jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				patient.setName(name);
				long ids=(long) jobject.get("id");
				int id=(int)ids;
				patient.setId(id);
				String mobilenum=(String)jobject.get("mobilenum");
				patient.setMobilenum(mobilenum);
				long ages=(long) jobject.get("age");
				int age=(int)ages;
				patient.setAge(age);
				patients.add(patient);
			}}
			
		
		return patients;
		
		
	}
		// To write  Docotr object to json File
		public void writeTodJson(List<Doctor> doctor) throws JsonGenerationException, JsonMappingException, IOException {
			
			JSONObject djson = new JSONObject();
			 JSONArray djsonArray=new JSONArray(); 
				
			for(Doctor d:doctor) {
				djson = new JSONObject();
	        djson.put("dname",d.getDname());
	        djson.put("did", d.getDid());
	        djson.put("specialisation", d.getSpecialisation());
	      djsonArray.add(djson);

			}
			
			try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/doctor.json")) {

			    file.write(djsonArray.toJSONString());
			    file.flush();

			} catch (IOException e) {
			    e.printStackTrace();
			}
		
		
		}

		// To read Doctor  object from json File
		public List<Doctor> readDoctorsData() throws JsonParseException, JsonMappingException, IOException {
			

	List<Doctor> doctorslist=new ArrayList<Doctor>();
	JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/doctor.json"));
		}  catch (IOException | ParseException e) {
			e.printStackTrace();
			
		}
		if(jsonArray!=null) {
	for (Object obj : jsonArray) {
		Doctor doctor=new Doctor(); 
		JSONObject jobject = (JSONObject) obj;
		String dname = (String) jobject.get("dname");
		doctor.setDname(dname);
		long dids= (long) jobject.get("did");
		int did=(int)dids;
		doctor.setDid(did);
		String specialisation=(String)jobject.get("specialisation");
		doctor.setSpecialisation(specialisation);
		doctorslist.add(doctor);
		
	}}
	

return doctorslist;
	}
		// To write Availability object from json File
		public void writeToAvailabilityJson(List<Availability> availability) throws JsonGenerationException, JsonMappingException, IOException {
			JSONObject json = new JSONObject();
			 JSONArray pjsonArray=new JSONArray(); 
			 JSONObject pjson = new JSONObject();
			 JSONObject djson = new JSONObject();
			for(Availability a:availability) {
				pjson = new JSONObject();
				pjson.put("name", a.getPatient().getName());
				pjson.put("id", a.getPatient().getId());
				pjson.put("mobilenum", a.getPatient().getMobilenum());
				pjson.put("age", a.getPatient().getAge());
				
				djson = new JSONObject();
				djson.put("dname",a.getDoctor().getDname());
				djson.put("did", a.getDoctor().getDid());
				djson.put("specialisation",a.getDoctor().getSpecialisation());
				
				
				
				json.put("patient", pjson);
				
				
	       
	        json.put("doctor", djson);
	        json.put("date",a.getDate());
	       pjsonArray.add(json);

			}
			
			try (FileWriter file = new FileWriter("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/availability.json")) {

			    file.write(pjsonArray.toJSONString());
			    file.flush();

			} catch (IOException e) {
			    e.printStackTrace();
			}
		
		}
			
		}

		


