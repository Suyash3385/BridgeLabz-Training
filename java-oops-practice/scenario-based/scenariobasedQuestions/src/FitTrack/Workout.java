package FitTrack;

abstract class Workout implements ITrackable {
	protected String type;
	protected int duration;
	protected double caloriesBurned;
	private String workoutLog="internal workout tracking data";
	Workout(String type,int duration){
		this.type=type;
		this.duration=duration;
		
	}
	
abstract double calculateCalories();
public double getCalories() {
	return caloriesBurned;
}
protected String getWorkoutLog() {
	return workoutLog;
}
}
