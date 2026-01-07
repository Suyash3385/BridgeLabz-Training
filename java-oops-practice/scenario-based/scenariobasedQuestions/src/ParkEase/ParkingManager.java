package ParkEase;

public class ParkingManager {

    private ParkingSlot[] slots;
    private String[] bookingLogs = new String[20];
    private int logIndex = 0;

    public ParkingManager(ParkingSlot[] slots) {
        this.slots = slots;
    }

    public boolean parkVehicle(Vehicle v) {
        for (ParkingSlot slot : slots) {
            if (slot.assignVehicle(v)) {
                addLog("Vehicle " + v.getVehicleNumber() +
                       " parked at Slot " + slot.getSlotId());
                return true;
            }
        }
        System.out.println("❌ No available slot for " + v.getClass().getSimpleName());
        return false;
    }

    public double removeVehicle(String vehicleNumber, int hours) {
        for (ParkingSlot slot : slots) {
            Vehicle v = slot.getParkedVehicle();

            if (v != null && v.getVehicleNumber().equals(vehicleNumber)) {

                
                double bill = v.calculateCharges(hours);

                slot.releaseSlot();
                addLog("Vehicle " + vehicleNumber + " exited. Bill: Rs. " + bill);

                return bill;
            }
        }
        System.out.println(" not found: " + vehicleNumber);
        return -1;
    }

    private void addLog(String entry) {
        if (logIndex < bookingLogs.length) {
            bookingLogs[logIndex++] = entry;
        } else {
            System.out.println(" Log storage full.");
        }
    }

    public void showLogs() {
       
        for (String log : bookingLogs) {
            if (log != null)
                System.out.println(log);
        }
    }

    public void showAvailableSlots() {
 
        boolean available = false;

        for (ParkingSlot slot : slots) {
            if (!slot.isOccupied()) {
                System.out.println(slot.getSlotId() + " (" + slot.getVehicleTypeAllowed() + ")");
                available = true;
            }
        }

        if (!available)
            System.out.println("No free slots");
    }
}
