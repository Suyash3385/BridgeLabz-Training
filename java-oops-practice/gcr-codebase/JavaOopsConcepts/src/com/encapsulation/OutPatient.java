package com.encapsulation;
	
	import java.util.*;

	class OutPatient extends Patient implements MedicalRecord {

	    private double consultationFee;
	    private double testCharges;
	    private List<String> medicalHistory = new ArrayList<>();

	    public OutPatient(int id, String name, int age,
	                      double consultationFee, double testCharges) {
	        super(id, name, age);
	        this.consultationFee = consultationFee;
	        this.testCharges = testCharges;
	    }

	    public double calculateBill() {
	        return consultationFee + testCharges;
	    }

	
	    public void addRecord(String record) {
	        medicalHistory.add(record);
	    }

	    public void viewRecords() {
	        System.out.println("Medical Records: " + medicalHistory);
	    }
	}


