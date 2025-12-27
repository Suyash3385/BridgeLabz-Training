package com.constructors.levelone;

public class Manager extends Employee {
	  String managerLevel;

	    Manager(int employeeID, String department, double salary, String managerLevel) {
	        super(employeeID, department, salary);
	        this.managerLevel=managerLevel;
	         }

	   
	    void displayManagerDetails() {
	        System.out.println("Employee ID: " + employeeID);      
	        System.out.println("Department: " + department);      
	        System.out.println("Salary: " + getSalary());         
	        System.out.println("Manager Level: " + managerLevel);
	    }
	

}
