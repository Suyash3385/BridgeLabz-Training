package vehiclerentalapplication;

	
	class Truck extends Vehicle {

	    private double loadChargePerDay = 800;

	    public Truck(String vehicleNumber) {
	        super(vehicleNumber, 1500);
	    }

	    @Override
	    public double calculateRent(int days) {
	        return (baseRate * days) + (loadChargePerDay * days);
	    }
	}



