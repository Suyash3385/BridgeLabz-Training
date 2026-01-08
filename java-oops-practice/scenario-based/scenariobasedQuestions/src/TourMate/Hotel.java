package TourMate;

public class Hotel {
	private String name;
    private double costPerNight;
    private int nights;
    Hotel(String name,double costPerNight,int nights){
    	this.name=name;
    	this.costPerNight=costPerNight;
    	this.nights=nights;
    }
    private double totalHotelCost() {
    	return costPerNight* nights;
    }
    public double getCost() {
    	return totalHotelCost();
    }
    
    public void showDetails() {
        System.out.println("Hotel: " + name + " | Nights: " + nights + " | Cost: ₹" + totalHotelCost());
    }
}
