package com.constructors.levelone;

public class EmployeeMain {

	    public static void main(String[] args) {

	        Manager manager=new Manager(
	           501,  "IT",  85000.0,   "Senior Manager"  );

	        manager.displayManagerDetails();

	       
	        manager.setSalary(95000.0);

	        System.out.println("After Salary Update:");
	        System.out.println("Updated Salary: "+manager.getSalary());
	    }

}
