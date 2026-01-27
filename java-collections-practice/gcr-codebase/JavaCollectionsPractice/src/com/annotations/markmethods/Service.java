package com.annotations.markmethods;

public class Service {


	    @ImportantMethod
	    public void processPayment() {
	        System.out.println("Processing payment");
	    }
	    @ImportantMethod(level="low")
	    public void generateReport() {
	        System.out.println("Generating report");
	    }
	    public void normalMethod() {
	        System.out.println("Normal method");
	    }
	}


