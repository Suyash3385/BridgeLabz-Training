package com.inheritance.singleInheritance;

public class DeviceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Device d1 = new Device("DEV001", true);

	
	        Thermostat t1 = new Thermostat("THERMO01", true, 22.5);

	        d1.displayStatus();
	        System.out.println();

	        t1.displayStatus();
	}

}
