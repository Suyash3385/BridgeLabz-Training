package ParkEase;

public class Main {
    public static void main(String[] args) {

        ParkingSlot[] slots = {
            new ParkingSlot("A1", "Car"),
            new ParkingSlot("A2", "Bike"),
            new ParkingSlot("A3", "Car"),
            new ParkingSlot("B1", "Truck")
        };

        ParkingManager pm = new ParkingManager(slots);

        Vehicle car  = new Car("MH12-1111");
        Vehicle bike = new Bike("MH12-2222");
        Vehicle truck = new Truck("MH12-3333");

        pm.parkVehicle(car);
        pm.parkVehicle(bike);
        pm.parkVehicle(truck);

        pm.showAvailableSlots();

        System.out.println("\nBill for truck: Rs. " + 
            pm.removeVehicle("MH12-3333", 4));

        pm.showLogs();
    }
}
