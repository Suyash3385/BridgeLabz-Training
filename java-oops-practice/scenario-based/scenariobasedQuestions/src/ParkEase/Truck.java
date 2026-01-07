package ParkEase;

public class Truck extends Vehicle {
    public Truck(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public double calculateCharges(int hours) {
        double baseRate = 100;
        double penalty = (hours > 3) ? 300 : 0;
        return baseRate * hours + penalty;
    }
}
