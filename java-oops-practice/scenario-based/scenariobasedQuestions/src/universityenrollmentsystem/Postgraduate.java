package universityenrollmentsystem;

	class Postgraduate extends Student implements Graded {

	    public Postgraduate(int id, String name) {
	        super(id, name);
	    }

	    @Override
	    public void assignGrade(String grade) {
	        double gradePoint = grade.equalsIgnoreCase("PASS") ? 4.0 : 0.0;
	        addGrade(gradePoint, 4);
	    }
	}



