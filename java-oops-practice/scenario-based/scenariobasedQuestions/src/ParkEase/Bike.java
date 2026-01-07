package ParkEase;

public class Bike extends Vehicle {
    public Bike(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 20;
        double penalty = (hours > 5) ? 100 : 0;
        return baseRate * hours + penalty;
    }
}
