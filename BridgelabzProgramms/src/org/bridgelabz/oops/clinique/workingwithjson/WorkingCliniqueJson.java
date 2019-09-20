package org.bridgelabz.oops.clinique.workingwithjson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

import com.google.gson.Gson;

public class WorkingCliniqueJson {

	JSONParser parser = new JSONParser();
	Gson gson = new Gson();

	// To write Patient object to json File
	public void writeToJson(List<Patient> patients) throws JsonGenerationException, JsonMappingException, IOException {
		String pstring = gson.toJson(patients);

		try (FileWriter file = new FileWriter(
				"/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/patient.json")) {

			file.write(pstring);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// To read Patient object from json File
	public List<Patient> readPatientsData() throws JsonParseException, JsonMappingException, IOException {
		List<Patient> patients = new ArrayList<Patient>();
		JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/patient.json"));
		} catch (IOException | ParseException e) {
			e.printStackTrace();

		}
		if (jsonArray != null) {
			for (Object obj : jsonArray) {
				Patient patient = new Patient();
				JSONObject jobject = (JSONObject) obj;
				String name = (String) jobject.get("name");
				patient.setName(name);
				long ids = (long) jobject.get("id");
				int id = (int) ids;
				patient.setId(id);
				String mobilenum = (String) jobject.get("mobilenum");
				patient.setMobilenum(mobilenum);
				long ages = (long) jobject.get("age");
				int age = (int) ages;
				patient.setAge(age);
				patients.add(patient);
			}
		}

		return patients;

	}

	// To write Docotr object to json File
	public void writeTodJson(List<Doctor> doctor) throws IOException {
		String doctorjson = gson.toJson(doctor);

		try (FileWriter file = new FileWriter(
				"/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/doctor.json")) {

			file.write(doctorjson);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// To read Doctor object from json File
	public List<Doctor> readDoctorsData() throws JsonParseException, JsonMappingException, IOException {

		List<Doctor> doctorslist = new ArrayList<Doctor>();
		JSONArray jsonArray = null;
		try {
			jsonArray = (JSONArray) parser.parse(new FileReader(
					"/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/doctor.json"));
		} catch (IOException | ParseException e) {
			e.printStackTrace();

		}
		if (jsonArray != null) {
			for (Object obj : jsonArray) {
				Doctor doctor = new Doctor();
				JSONObject jobject = (JSONObject) obj;
				String dname = (String) jobject.get("dname");
				doctor.setDname(dname);
				long dids = (long) jobject.get("did");
				int did = (int) dids;
				doctor.setDid(did);
				String specialisation = (String) jobject.get("specialisation");
				doctor.setSpecialisation(specialisation);
				doctorslist.add(doctor);

			}
		}

		return doctorslist;
	}

	// To write Availability object from json File
	public void writeToAvailabilityJson(List<Availability> availability) throws IOException {

		String availabilitystring = gson.toJson(availability);

		try (FileWriter file = new FileWriter(
				"/home/admin1/Programms/BridgelabzProgramms/src/org/bridgelabz/oops/clinique/workingwithjson/availability.json")) {

			file.write(availabilitystring);
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
