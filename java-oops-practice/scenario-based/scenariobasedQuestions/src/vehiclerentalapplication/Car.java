package vehiclerentalapplication;

	
	class Car extends Vehicle {

	    private double luxuryCharge = 500;

	    public Car(String vehicleNumber) {
	        super(vehicleNumber, 1000);
	    }

	    @Override
	    public double calculateRent(int days) {
	        return (baseRate * days) + luxuryCharge;
	    }
	}



