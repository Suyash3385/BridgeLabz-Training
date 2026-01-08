package TourMate;
import java.util.*;
public abstract  class Trip implements IBookable {
private String destination;
private double budget;
private int duration;
protected Transport transport;
protected Hotel hotel;
protected ArrayList<Activity> activities = new ArrayList<>();

Trip(String destination,double budget,int duration,Transport transport ,Hotel hotel ,ArrayList<Activity> activities){
	this.destination=destination;
	this.budget=budget;
	this.duration=duration;
	this.transport=transport;
	this.hotel=hotel;
	this.activities=activities;
}
public double calculateCost() {
	double total=0;
	total+=transport.getCost();
	total+=hotel.getCost();
	
	for(Activity a:activities) {
		total+=a.getCost();
	}
	return total;
}
public void showTripDetails() {
    System.out.println("Destination: " + destination);
    System.out.println("Duration: " + duration + " days");
    System.out.println("Budget: " + budget);
    transport.showDetails();
    hotel.showDetails();

    System.out.println("Activities:");
    for (Activity a : activities) a.showDetails();

    System.out.println("Total Package Cost: " + calculateCost());
    
}


public abstract void book();
public abstract void cancel();
}

