package org.bridgelabz.oops.clinique.interfaceimpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.bridgelabz.oops.clinique.interfaces.CliniqueInterfaces;
import org.bridgelabz.oops.clinique.model.Availability;
import org.bridgelabz.oops.clinique.model.Doctor;
import org.bridgelabz.oops.clinique.model.Patient;
import org.bridgelabz.oops.clinique.workingwithjson.WorkingCliniqueJson;
import org.bridgelabz.programms.utility.InputScanner;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class DataImplementation implements CliniqueInterfaces {
	String name;
	int id;
	String mobilenum;
	int age;
	List<Patient> patientlist = new ArrayList<Patient>();
	WorkingCliniqueJson workingCliniqueJson = new WorkingCliniqueJson();

	// To add the patient
	public void addPerson(int num) {
		for (int i = 0; i < num; i++) {
			Patient patient = new Patient();
			System.out.println("enter  name");
			name = InputScanner.getString();
			System.out.println("enter ID");
			id = InputScanner.getInt();
			System.out.println("enter mobile number");
			mobilenum = InputScanner.getString();
			System.out.println("enter age");
			age = InputScanner.getInt();
			patient.setName(name);
			patient.setId(id);
			patient.setMobilenum(mobilenum);
			patient.setAge(age);
			patientlist.add(patient);
		}
		try {
			workingCliniqueJson.writeToJson(patientlist);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	List<Doctor> doctorlist = new ArrayList<Doctor>();
	String dname;
	int did;
	String specialisation;
	Availability availability;

	// To add the Doctor
	public void addDoctors(int dnumber) {
		for (int i = 0; i < dnumber; i++) {
			Doctor doctor = new Doctor();
			System.out.println("enter  name");
			dname = InputScanner.getString();
			System.out.println("enter ID");
			did = InputScanner.getInt();
			System.out.println("enterspecialisation");
			specialisation = InputScanner.getString();
			System.out.println("enter age");
			age = InputScanner.getInt();
			doctor.setDname(dname);
			doctor.setDid(did);
			doctor.setSpecialisation(specialisation);
			doctorlist.add(doctor);
		}
		try {
			workingCliniqueJson.writeTodJson(doctorlist);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
