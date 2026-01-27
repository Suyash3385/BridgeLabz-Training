package com.annotations.loggingmethod;
import java.lang.reflect.Method;
public class Main {
	    public static void main(String[] args) throws Exception {

	        PerformanceTest test=new PerformanceTest();
	        Class testClass=test.getClass();
	        Method[] methods=testClass.getDeclaredMethods();
	        for (int i=0;i<methods.length; i++) {
	            Method method=methods[i];
	            if (method.isAnnotationPresent(LogExecutionTime.class)) {
	                long startTime=System.nanoTime();
	                method.invoke(test);
	                long endTime=System.nanoTime();
	                long executionTime=endTime-startTime;

	                System.out.println("Method: " + method.getName() + " Execution Time: " + executionTime );
	            }
	        }
	    }
	}


