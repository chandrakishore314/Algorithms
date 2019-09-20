package org.bridgelabz.oops.clinique.main;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.bridgelabz.oops.clinique.interfaceimpl.DataImplementation;
import org.bridgelabz.oops.clinique.interfaces.CliniqueInterfaces;
import org.bridgelabz.oops.clinique.model.Availability;
import org.bridgelabz.oops.clinique.model.Doctor;
import org.bridgelabz.oops.clinique.model.Patient;
import org.bridgelabz.oops.clinique.workingwithjson.WorkingCliniqueJson;
import org.bridgelabz.programms.utility.InputScanner;
import org.bridgelabz.programms.utility.Utility;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class PersonsData {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		CliniqueInterfaces cliniqueInterfaces= new DataImplementation();
		System.out.println("enter number of patients  data to enter");
		int number = InputScanner.getInt();
		cliniqueInterfaces.addPerson(number);
		System.out.println("enter number of Doctors  data to enter");
		int dnumber =InputScanner.getInt();
		cliniqueInterfaces.addDoctors(dnumber);
		// working with json Data
		WorkingCliniqueJson workingCliniqueJson = new WorkingCliniqueJson();
		List<Doctor> doctor = workingCliniqueJson.readDoctorsData();
		
		List<Patient> patient = workingCliniqueJson.readPatientsData();
		// Assigning Doctor patient & with Time

		String doctorname;
		Calendar calendar = Calendar.getInstance();
		List<Availability> availability = new ArrayList<Availability>();
		for (Patient p : patient) {
			Availability a = new Availability();
			a.setPatient(p);
			System.out.println("patient enter doctor name ");
			doctorname = InputScanner.getString();
			for (Doctor d : doctor) {
				if (d.getDname().equals(doctorname)) {
					a.setDoctor(d);
					int num = 0;
					for (Availability avail : availability) {
						if (d.getDname() == avail.getDoctor().getDname()) {
							num++;
						}
						if (num > 5) {
							calendar.add(Calendar.DAY_OF_YEAR, 1);
							a.setDate(calendar.getTime().toString());
						}
						if (num < 5) {
						
							a.setDate(calendar.getTime().toString());
						}
					}
					new Date().toString();
				}
			}
			availability.add(a);
		}
		workingCliniqueJson.writeToAvailabilityJson(availability);
		
		for (Availability avail : availability) {
			System.out.println(avail);
		}
		
		for (int i=0;i< doctor.size();i++) {
			System.out.println(doctor.get(0).getDname()+" "+Collections.frequency(availability, doctor.get(0).getDname()));
		
		}
	//	doctor.stream().filter(name->doctor.getClass().getName().equals(doctor));
		
		
		
	}
}
