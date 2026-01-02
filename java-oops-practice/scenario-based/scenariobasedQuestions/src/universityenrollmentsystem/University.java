package universityenrollmentsystem;

public class University {

	    public static void main(String[] args) {

	        Faculty faculty = new Faculty("Dr. Singh");

	        Student ug = new Undergraduate(101, "Suyash");
	        Student pg = new Postgraduate(201, "Ravi");

	        Course java = new Course("CS101", "Java Programming", 3);

	        Enrollment e1 = new Enrollment(ug, java);
	        Enrollment e2 = new Enrollment(pg, java);

	        e1.enroll();
	        e2.enroll();

	        faculty.gradeStudent((Graded) ug, "A");
	        faculty.gradeStudent((Graded) pg, "PASS");

	        ug.viewTranscript();
	        pg.viewTranscript();
	    }
	}


