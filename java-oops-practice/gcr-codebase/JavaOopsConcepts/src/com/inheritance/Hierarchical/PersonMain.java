package com.inheritance.Hierarchical;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        Teacher t1 = new Teacher("Mr. Suyash", 35, "Mathematics");
        Student s1 = new Student("Riya", 14, "8th Grade");
        Staff st1 = new Staff("Amit", 28, "Administration");

        
        t1.displayInfo();
        System.out.println();


        s1.displayInfo();
        System.out.println();

        st1.displayInfo();

	}

}
