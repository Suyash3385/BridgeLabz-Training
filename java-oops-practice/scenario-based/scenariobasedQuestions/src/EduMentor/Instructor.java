package EduMentor;

public class Instructor extends User {
	Instructor(String name,String email,int id){
		super(name,email,id);
	}
	public void displayRole() {
		System.out.println("role: instructor");
	}

}
