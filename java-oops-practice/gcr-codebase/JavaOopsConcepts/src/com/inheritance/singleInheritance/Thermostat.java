package com.inheritance.singleInheritance;

public class Thermostat extends Device{
	 
	 double temperatureSetting; 

	
	    public Thermostat(String deviceId, boolean status, double temperatureSetting) {
	        super(deviceId, status); 
	        this.temperatureSetting = temperatureSetting;
	    }

	    @Override
	    public void displayStatus() {
	        super.displayStatus(); 
	        System.out.println("Temperature Setting : " + temperatureSetting + "°C");
	    }
	}

