package vehiclerentalapplication;
	
	import java.util.*;

	public class VehicleRentalApp {

	    public static void processRental(Customer customer, Vehicle vehicle, int days) {

	        customer.displayCustomer();
	        vehicle.displayVehicle();

	        double rent = vehicle.calculateRent(days);
	        System.out.println("Rental Days: " + days);
	        System.out.println("Total Rent: " + rent);

	    }

	    public static void main(String[] args) {

	        Customer c1 = new Customer(101, "Suyash");

	        Vehicle bike = new Bike("BIKE-001");
	        Vehicle car = new Car("CAR-101");
	        Vehicle truck = new Truck("TRUCK-900");

	        processRental(c1, bike, 3);
	        processRental(c1, car, 2);
	        processRental(c1, truck, 4);
	    }
	}



