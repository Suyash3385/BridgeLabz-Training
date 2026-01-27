package com.annotations.loggingmethod;

public class PerformanceTest {

	    @LogExecutionTime
	    public void fastMethod() {
	        for (int i=0;i<100000;i++){
	      }
	    }
	    @LogExecutionTime
	    public void slowMethod() {
	        for (int i=0;i<10000000;i++) {
	        }
	    }
	    public void normalMethod() {
	        System.out.println("This method is not timed");
	  }
	}


