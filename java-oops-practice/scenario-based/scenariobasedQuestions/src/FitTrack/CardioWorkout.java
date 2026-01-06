package FitTrack;

public class CardioWorkout extends Workout {
	
CardioWorkout(int duration){
	super("cardio",duration);
	
}
public double calculateCalories() {
	caloriesBurned=duration*8.0;
	return caloriesBurned;
}
public void startWorkout() {
	System.out.println("cardio workout started");
	
}
public void stopWorkout() {
	System.out.println("cardio workout stopped");
}
}
