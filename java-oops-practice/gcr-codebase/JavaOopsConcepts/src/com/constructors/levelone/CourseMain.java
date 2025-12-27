package com.constructors.levelone;

public class CourseMain {
	
	
	
	    public static void main(String[] args){

	        Course c1=new Course("Core Java", 3, 15000);
	        Course c2=new Course("Full Stack Development", 6, 45000);

	        System.out.println("Before Updating Institute Name:");
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();

	     
	        Course.updateInstituteName("Technocrats");

	       
	        c1.displayCourseDetails();
	        System.out.println();
	        c2.displayCourseDetails();
	  }
	}



