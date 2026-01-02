package com.encapsulation;
import java.util.*;
	public class HospitalApp {

	    public static void processPatients(List<Patient> patients) {

	        for (Patient p : patients) {

	            p.getPatientDetails();
	            System.out.println("Total Bill: " + p.calculateBill());

	            if (p instanceof MedicalRecord) {
	                MedicalRecord m = (MedicalRecord) p;
	                m.viewRecords();
	            }

	        }
	    }

	    public static void main(String[] args) {

	        List<Patient> patients = new ArrayList<>();

	        InPatient ip = new InPatient(1, "Suyash", 25, 5, 2000, 15000);
	        ip.addRecord("Diagnosed with Dengue");
	        ip.addRecord("Under observation");

	        OutPatient op = new OutPatient(2, "Amit", 30, 500, 1200);
	        op.addRecord("Routine checkup");

	        patients.add(ip);
	        patients.add(op);

	        processPatients(patients);
	    }
	}


