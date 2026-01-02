package universityenrollmentsystem;

	
	class Faculty {

	    private String name;

	    public Faculty(String name) {
	        this.name = name;
	    }

	    public void gradeStudent(Graded student, String grade) {
	        student.assignGrade(grade);
	    }
	}



