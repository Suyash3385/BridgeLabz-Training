package FitTrack;

public class Main {
public static void main(String[]args) {
	UserProfile u=new UserProfile("sachin",24,89.75,"weight loss");
	u.displayProfile();
	int dailyTarget=600;
	Workout w1=new CardioWorkout(45);
	w1.startWorkout();
	double calories1=w1.calculateCalories();
	w1.stopWorkout();
	
	Workout w2=new StrengthWorkout(30);
	w2.startWorkout();
	double calories2=w2.calculateCalories();
	w2.stopWorkout();
	double totalBurned=calories1+calories2;
	double remaining=dailyTarget-totalBurned;
	System.out.println("calories burned "+totalBurned);
	System.out.println("remainig target "+ remaining);
}
}
