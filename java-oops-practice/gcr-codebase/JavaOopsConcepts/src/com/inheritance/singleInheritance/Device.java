package com.inheritance.singleInheritance;

public class Device {
	   String deviceId;
	    boolean status; 

	   
	    public Device(String deviceId, boolean status) {
	        this.deviceId = deviceId;
	        this.status = status;
	    }

	    
	    public void displayStatus() {
	        System.out.println("Device ID : " + deviceId);
	        System.out.println("Status    : " + (status ? "ON" : "OFF"));
	    }
	}


