package universityenrollmentsystem;


	
	class Undergraduate extends Student implements Graded {

	    public Undergraduate(int id, String name) {
	        super(id, name);
	    }

	    @Override
	    public void assignGrade(String grade) {
	        double gradePoint = switch (grade) {
	            case "A" -> 4.0;
	            case "B" -> 3.0;
	            case "C" -> 2.0;
	            default -> 0.0;
	        };
	        addGrade(gradePoint, 3);
	    }
	}



