package org.bridgelabz.oops.clinique;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.bridgelbz.programms.utility.Utility;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;


public class DataImplementation {
	String name;
	int id;
	String mobilenum;
	int age;
	List<Patient> patientlist = new ArrayList<Patient>();
	Scanner scanner = Utility.getScanner();
	WorkingCliniqueJson workingCliniqueJson=new WorkingCliniqueJson();
	public void addPerson(int num) throws JsonGenerationException, JsonMappingException, IOException {
		for (int i = 0; i < num; i++) {
			Patient patient=new Patient();
			System.out.println("enter  name");
			name = scanner.next();
			System.out.println("enter ID");
			id= scanner.nextInt();
			System.out.println("enter mobile number");
			mobilenum = scanner.next();
			System.out.println("enter age");
			age= scanner.nextInt();
			patient.setName(name);
			patient.setId(id);
			patient.setMobilenum(mobilenum);
			patient.setAge(age);
			patientlist.add(patient);
		}
		 workingCliniqueJson.writeToJson(patientlist);
	}
	List<Doctor> doctorlist = new ArrayList<Doctor>();
	String dname;
	 int did;
	 String specialisation;
	 Availability availability;
	public void addDoctors(int dnumber) throws JsonGenerationException, JsonMappingException, IOException {
		for (int i = 0; i < dnumber; i++) {
			Doctor doctor=new Doctor();
			System.out.println("enter  name");
			dname = scanner.next();
			System.out.println("enter ID");
			did= scanner.nextInt();
			System.out.println("enterspecialisation");
			specialisation= scanner.next();
			System.out.println("enter age");
			age= scanner.nextInt();
			doctor.setDname(dname);
			doctor.setDid(did);
			doctor.setSpecialisation(specialisation);
			doctorlist.add(doctor);
		}
		workingCliniqueJson.writeTodJson(doctorlist);
	}
		
	
}
