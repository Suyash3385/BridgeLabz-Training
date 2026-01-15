package com.hospitalqueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		 Patient[] patients = {new Patient("Rahul", 4),new Patient("Meena", 9),new Patient("Aarav", 7),new Patient("Karan", 3), new Patient("Sneha", 10) };
		   Hospital h = new Hospital();
		        System.out.println("Before sorting:");
		        for (Patient p : patients) {
		            System.out.println(p);
		        }
		        h.getByCriticality(patients);
		        System.out.println("After sorting by criticality:");
		        for (Patient p : patients) {
		            System.out.println(p);
		        }
		    }

	}


