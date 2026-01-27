package com.annotations.markmethods;
import java.lang.reflect.Method;
public class Main {
	    public static void main(String[] args) {

	        Class serviceClass=Service.class;
	        Method[]methods=serviceClass.getDeclaredMethods();
	        for (int i=0;i<methods.length; i++) {
	            Method method=methods[i];
	            if (method.isAnnotationPresent(ImportantMethod.class)) {
	                ImportantMethod imp=method.getAnnotation(ImportantMethod.class);
	                System.out.println("Method Name: " + method.getName());
	                System.out.println("Importance Level: " + imp.level());
	         
	       }
	    }
	   }
	}


