package com.reflection;
	import java.lang.reflect.Constructor;
	import java.lang.reflect.Field;
	import java.lang.reflect.Method;
	import java.lang.reflect.Modifier;
	import java.util.Scanner;

	public class ClassInformation {
	    public static void main(String[] args) {
	        Scanner scanner=new Scanner(System.in);
	        System.out.print("Enter class name: ");
	        String className=scanner.nextLine();
	        try {
	            Class<?>cls=Class.forName(className);
	            System.out.println("Class Name: "+ cls.getName());
	   
	            Constructor<?>[]constructors=cls.getDeclaredConstructors();
	            for (Constructor<?>c:constructors) {
	                System.out.println(Modifier.toString(c.getModifiers()) + c.getName() +  getParameters(c.getParameterTypes()) + ")");
	            }
	            Field[] fields=cls.getDeclaredFields();
	            for (Field f:fields) {
	                System.out.println(Modifier.toString(f.getModifiers())+f.getType().getSimpleName() + " " + f.getName());
	            }
	            Method[] methods=cls.getDeclaredMethods();
	            for (Method m:methods) {
	                System.out.println(Modifier.toString(m.getModifiers()) + " " +m.getReturnType().getSimpleName() + " " + m.getName() + "(" + getParameters(m.getParameterTypes()) + ")");
	            }

	        } 
	        catch (ClassNotFoundException e) {
	            System.out.println("Class not found");
	        }

	    }
	    private static String getParameters(Class<?>[] params) {
	        StringBuilder sb=new StringBuilder();
	        for (int i=0;i<params.length; i++) {
	            sb.append(params[i].getSimpleName());
	            if (i<params.length-1) {
	                sb.append(", ");
	            }
	        }
	        return sb.toString();
	    }
	}


