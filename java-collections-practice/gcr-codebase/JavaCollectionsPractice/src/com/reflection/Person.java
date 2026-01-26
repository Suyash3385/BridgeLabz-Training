package com.reflection;

	import java.lang.reflect.Field;

	public class Person {

	    private int age = 25;

	    public static void main(String[] args) {
	        try {
	            
	            Person person=new Person();
	            Class<?> cls=person.getClass();
	            Field ageField=cls.getDeclaredField("age");

	            ageField.setAccessible(true);
	            int originalAge=ageField.getInt(person);
	            System.out.println("Original Age: " + originalAge);
	            ageField.setInt(person, 40);
	            int updatedAge=ageField.getInt(person);
	            System.out.println("Updated Age: " + updatedAge);

	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


