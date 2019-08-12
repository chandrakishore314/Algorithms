package org.bridgelabz.oops.clinique.model;


import org.bridgelabz.oops.clinique.model.Patient;
import org.bridgelabz.oops.clinique.model.Doctor;;

public class Availability {
	private Patient patient;
	private String date;
	private Doctor doctor;
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	public Doctor getDoctor() {
		
		return doctor;
	}
	
	public void setDoctor(Doctor doctor) {
		
		this.doctor = doctor;
	
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Availability of patient=" + patient.getName() + "on  date=" + date + "with the  doctor="   + doctor.getDname() + "  ;";
	}
}
