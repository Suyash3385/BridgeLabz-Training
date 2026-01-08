package TourMate;
import java.util.*;
public class Main {
	
	    public static void main(String[] args) {
	        ArrayList<Activity> indiaActivities = new ArrayList<>();
	        indiaActivities.add(new Activity("River Rafting", 1500));
	        indiaActivities.add(new Activity("Local Sightseeing", 800));

	        ArrayList<Activity> japanActivities = new ArrayList<>();
	        japanActivities.add(new Activity("Temple Tour", 2000));
	        japanActivities.add(new Activity("Bullet Train Experience", 5000));
	        Trip domestic = new DomesticTrip("Manali",20000,5,  new Transport("Bus", 3000), new Hotel("Snow Resort", 2000, 4), indiaActivities );
	        domestic.showTripDetails();
	        domestic.book();

	    }
	}



