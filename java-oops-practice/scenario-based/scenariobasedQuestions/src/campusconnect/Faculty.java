package campusconnect;
import java.util.*;
public class Faculty extends Person {
private String department;

public Faculty(String name,String email,int id,String department) {
	super(name,email,id);
	this.department=department;
}
 void printDetails() {
	 System.out.println("faculty: " + name + ", Email: " + email + ", Dept: " + department );
 }
}
    