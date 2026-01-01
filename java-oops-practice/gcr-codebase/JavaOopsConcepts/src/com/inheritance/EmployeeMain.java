package com.inheritance;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Employee e1=new Manager("ramesh",1,50000,5);
  Employee e2=new Developer("suresh",2,30000,"java");
  Employee e3=new Intern("jay",3,15000,3);
  
  e1.displayDetails();
  e2.displayDetails();
  e3.displayDetails();

  
	}

}
