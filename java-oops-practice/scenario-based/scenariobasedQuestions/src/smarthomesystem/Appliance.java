package smarthomesystem;

	
	abstract class Appliance implements Controllable {

	    private boolean powerStatus;   
	    private int powerUsage;       

	    public Appliance(int powerUsage) {
	        this.powerUsage = powerUsage;
	        this.powerStatus = false;
	    }

	    protected void setPowerStatus(boolean status) {
	        this.powerStatus = status;
	    }

	    public boolean isOn() {
	        return powerStatus;
	    }

	    public int getPowerUsage() {
	        return powerUsage;
	    }

	    public void showStatus() {
	        System.out.println("Status: " + (powerStatus ? "ON" : "OFF"));
	        System.out.println("Power Usage: " + powerUsage + "W");
	    }
	}



