package com.constructors.levelone;

public class Employee {
	
    public int employeeID;          
    protected String department;    
    private double salary;       

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID=employeeID;
        this.department=department;
        this.salary=salary;
    }

    //  getter 
    public double getSalary(){
        return salary;
    }

  
    public void setSalary(double salary) {
        if (salary>0) {
            this.salary=salary;
        }
    }
}
