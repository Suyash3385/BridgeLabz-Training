package com.encapsulation;
import java.util.*;



	class InPatient extends Patient implements MedicalRecord {

	    private int numberOfDays;
	    private double roomChargePerDay;
	    private double treatmentCost;
	    private List<String> medicalHistory = new ArrayList<>();

	    public InPatient(int id, String name, int age,
	                     int days, double roomCharge, double treatmentCost) {
	        super(id, name, age);
	        this.numberOfDays = days;
	        this.roomChargePerDay = roomCharge;
	        this.treatmentCost = treatmentCost;
	    }

	
	    public double calculateBill() {
	        return (numberOfDays * roomChargePerDay) + treatmentCost;
	    }

	    public void addRecord(String record) {
	        medicalHistory.add(record);
	    }

	
	    public void viewRecords() {
	        System.out.println("Medical Records: " + medicalHistory);
	    }
	}


