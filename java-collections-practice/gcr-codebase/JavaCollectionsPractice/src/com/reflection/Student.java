package com.reflection;
	import java.lang.reflect.Constructor;

	public class Student {

	    private int id;
	    private String name;

	    // Constructor
	    public Student(int id, String name) {
	        this.id=id;
	        this.name=name;
	    }
	    public void display() {
	        System.out.println("ID: " + id + ", Name: " + name);
	    }

	    public static void main(String[] args) {
	        try {
	            Class<?> cls=Class.forName("Student");
	            Constructor<?> constructor=cls.getConstructor(int.class, String.class);
	            Object obj=constructor.newInstance(101, "Suyash");
	            Student student=(Student) obj;
	            student.display();
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}



