package com.constructors.levelone;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		        PostgraduateStudent pg = new PostgraduateStudent(
		                101,
		                "Suyash",
		                8.5,
		                "Computer Science"
		        );

		        pg.displayPGStudentDetails();

		     
		        pg.setCgpa(9.1);
		        System.out.println("Updated CGPA: " + pg.getCgpa());
		    
	}

}
