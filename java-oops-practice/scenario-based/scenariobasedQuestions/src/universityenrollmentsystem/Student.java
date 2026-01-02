package universityenrollmentsystem;
	abstract class Student {

	    private int studentId;
	    private String name;

	    private double totalGradePoints;
	    private int totalCredits;

	    public Student(int studentId, String name) {
	        this.studentId = studentId;
	        this.name = name;
	    }

	    
	    public Student(int studentId, String name, boolean hasElectives) {
	        this(studentId, name);
	    }

	    protected void addGrade(double gradePoint, int credits) {
	        totalGradePoints += gradePoint * credits;
	        totalCredits += credits;
	    }

	    public double getGPA() {
	        if (totalCredits == 0) return 0;
	        return totalGradePoints / totalCredits;
	    }

	    public void viewTranscript() {
	        System.out.println("Student: " + name);
	        System.out.println("GPA: " + getGPA());
	    }
	}


