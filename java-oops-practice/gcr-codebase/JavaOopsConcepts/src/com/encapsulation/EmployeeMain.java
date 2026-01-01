package com.encapsulation;

import java.util.ArrayList;
import java.util.List;


public class EmployeeMain {



	    public static void main(String[] args) {

	        List<Employee> employees = new ArrayList<>();

	        Employee e1 = new FullTimeEmployee(101, "Rahul", 50000);
	        Employee e2 = new PartTimeEmployee(102, "Anita", 120, 300);

	        e1.assignDepartment("IT");
	        e2.assignDepartment("HR");

	        employees.add(e1);
	        employees.add(e2);

	      
	        for (Employee emp : employees) {
	            emp.displayDetails();
	        }
	    }
	}


