package TourMate;
import java.util.*;
public class DomesticTrip extends Trip{

    public DomesticTrip(String destination, double budget, int duration,
                        Transport t, Hotel h, ArrayList<Activity> a) {
super(destination,budget,duration,t,h,a);

}
    public void book() {
        System.out.println("Domestic Trip booked successfully");
        System.out.println("No passport or visa required");
    }

    @Override
    public void cancel() {
        System.out.println("Domestic Trip cancelled");
    }
}
