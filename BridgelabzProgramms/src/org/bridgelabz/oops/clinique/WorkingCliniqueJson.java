package org.bridgelabz.oops.clinique;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.Bridgelbz.programms.Utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

public class WorkingCliniqueJson {
	
		ObjectMapper objectMapper=Utility.getObjectMapper();
		
		
		public void writeToJson(List<Patient> patients) throws JsonGenerationException, JsonMappingException, IOException {
			objectMapper.writeValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/patient.json"), patients);
		}

		public List<Patient> readPatientsData() throws JsonParseException, JsonMappingException, IOException {
			List<Patient> jsondata= 
					objectMapper.readValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/patient.json"),new TypeReference<List<Patient>>() {});
	return jsondata;
		
	}
		public void writeTodJson(List<Doctor> doctor) throws JsonGenerationException, JsonMappingException, IOException {
			objectMapper.writeValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/doctor.json"), doctor);
		}

		public List<Doctor> readDoctorsData() throws JsonParseException, JsonMappingException, IOException {
			List<Doctor> jsondata= 
					objectMapper.readValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/doctor.json"),new TypeReference<List<Doctor>>() {});
	return jsondata;
		
	}

		public void writeToAvailabilityJson(List<Availability> availability) throws JsonGenerationException, JsonMappingException, IOException {
			objectMapper.writeValue(new File("/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/availability.json"), availability);
		}
			
		}

		


