package com.inheritance.hybrid;

public class Chef extends Person implements Worker{
	 String specialty;

	    public Chef(String name, int id, String specialty) {
	        super(name, id);
	        this.specialty = specialty;
	    }

	    @Override
	    public void performDuties() {
	        System.out.println(name + " is cooking " + specialty);
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Specialty : " + specialty);
	    }
	

}
