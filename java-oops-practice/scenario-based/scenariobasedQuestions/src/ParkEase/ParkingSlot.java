package ParkEase;

public class ParkingSlot {
    private String slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;
    private Vehicle parkedVehicle;

    public ParkingSlot(String slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean assignVehicle(Vehicle v) {
        if (!isOccupied && v.getClass().getSimpleName().equals(vehicleTypeAllowed)) {
            isOccupied = true;
            parkedVehicle = v;
            return true;
        }
        return false;
    }

    public void releaseSlot() {
        isOccupied = false;
        parkedVehicle = null;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
