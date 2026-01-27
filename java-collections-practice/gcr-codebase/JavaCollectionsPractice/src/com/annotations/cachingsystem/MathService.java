package com.annotations.cachingsystem;

public class MathService {


	    @CacheResult
	    public int expensiveCalculation(int number) {
	        System.out.println( number);

	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        return number*number;
	    }
	}


