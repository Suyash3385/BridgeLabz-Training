package com.builtfunction;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	       Vehicle.updateRegistrationFee(150.0); 
	      
	       Vehicle vehicle1 = new Vehicle("Honest raj", "Sedan", "ABC123");
	       Vehicle vehicle2 = new Vehicle("Price danish", "SUV", "XYZ789");
	      
	       vehicle1.displayRegistrationDetails();
	       System.out.println();
	       vehicle2.displayRegistrationDetails();
	}

}
