package com.constructors.levelone;

public class PostgraduateStudent extends Student{

    String specialization;

    PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization=specialization;
    }

  
    void displayPGStudentDetails() {
        System.out.println("Roll Number: " + rollNumber); 
        System.out.println("Name: " + name);             
        System.out.println("CGPA: " + getCgpa());          
        System.out.println("Specialization: " + specialization);
    }

}
