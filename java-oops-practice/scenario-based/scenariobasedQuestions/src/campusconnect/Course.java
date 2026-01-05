package campusconnect;
import java.util.*;
public class Course {
private String courseName;
private Faculty facultyAssigned;
private List<Student> enrolledStudents;

 Course(String courseName,Faculty facultyAssigned){
	 this.courseName=courseName;
	 this.facultyAssigned=facultyAssigned;
	 this.enrolledStudents=new ArrayList<>();
	  
 }
 public String getCourseName() { return courseName; }
 public Faculty getFacultyAssigned() { return facultyAssigned; }
 public List<Student> getEnrolledStudents() { return enrolledStudents; }
 public void addStudent(Student s) { enrolledStudents.add(s); }
 public void removeStudent(Student s) { enrolledStudents.remove(s); }
}
