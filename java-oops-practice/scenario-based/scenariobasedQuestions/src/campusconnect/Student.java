package campusconnect;
import java.util.*;
public class Student extends Person{
	private HashMap<Course,Double>grades;
	Student (String name,String email,int id){
		super(name,email,id);
		this.grades=new HashMap<>();
		
	}
	  public void enrollCourse(Course course) {
	        course.addStudent(this);
	        grades.put(course, 0.0); 
	        System.out.println(name + " enrolled in " + course.getCourseName());
	}
	  public void setGrade(Course course, double grade) {
	        if(grades.containsKey(course)) grades.put(course, grade);
	        else System.out.println("Student not enrolled in this course");
    }
	    public double calculateGPA(){
	        if(grades.isEmpty())return 0.0;
	        double sum=0;
	        for(double g : grades.values()) sum += g;
	        return sum/grades.size();
	    }
	    void printDetails(){ 
	        System.out.println("Student: " + name + ", Email: " + email + ", GPA: " + calculateGPA());
    }
	}
	

