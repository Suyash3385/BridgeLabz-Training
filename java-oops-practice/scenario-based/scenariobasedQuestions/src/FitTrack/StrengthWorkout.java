package FitTrack;

public class StrengthWorkout extends Workout {
	
	  StrengthWorkout(int duration) {
	        super("Strength", duration);
	    }
	 public double calculateCalories() {
		 caloriesBurned=duration*5.0;
		 return caloriesBurned;
	 }
	 public void startWorkout() {
			System.out.println("cardio workout started");
			
		}
		public void stopWorkout() {
			System.out.println("cardio workout stopped");
		}
}
