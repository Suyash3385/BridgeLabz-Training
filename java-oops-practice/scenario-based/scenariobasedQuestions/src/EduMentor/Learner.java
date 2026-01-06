package EduMentor;

public class Learner extends User{
	Learner(String name ,String email,int id){
		super(name,email,id);
		
		
	}
	public void displayRole() {
		System.out.println("role : learner");
	}

}
