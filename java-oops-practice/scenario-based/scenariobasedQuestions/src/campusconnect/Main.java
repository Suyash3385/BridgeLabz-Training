package campusconnect;
import java.util.*;
public class Main {
public static void main(String[]args) {
	Faculty f1=new Faculty("Dr bhogey","abhogey11@gmail.com",2219,"computer science");
	Course c=new Course("data structures",f1);
	
	Student s1=new Student("priyansh","pri@gmail.com",21);
	Student s2=new Student("samarjeet","samarjeet88@gmail.com",31);
	
	s1.enrollCourse(c);
	s2.enrollCourse(c);
	
	s1.setGrade(c,3.8);
	s2.setGrade(c,3.5);
	
	s1.printDetails();
	s2.printDetails();
	f1.printDetails();
}
}
