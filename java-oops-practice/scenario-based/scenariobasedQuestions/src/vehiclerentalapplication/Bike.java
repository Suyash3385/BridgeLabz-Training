package vehiclerentalapplication;

	class Bike extends Vehicle {

	    public Bike(String vehicleNumber) {
	        super(vehicleNumber, 200);
	    }

	    @Override
	    public double calculateRent(int days) {
	        return baseRate * days;
	    }
	}



