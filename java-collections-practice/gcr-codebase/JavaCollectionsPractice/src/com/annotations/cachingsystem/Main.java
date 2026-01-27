package com.annotations.cachingsystem;

public class Main {

	    public static void main(String[] args) throws Exception {

	        MathService service=new MathService();
	        System.out.println( CacheExecutor.execute(service,"expensiveCalculation",new Class[] { int.class },new Object[] { 5 } ));

	        System.out.println( CacheExecutor.execute(service,"expensiveCalculation",new Class[] { int.class },new Object[] { 5 }));
	    }
	}


