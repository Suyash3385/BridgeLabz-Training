package homnest;

public  abstract class Device implements IControllable {
	int id;
	private boolean status;
	int usage;
	
	Device(int id,int usage){
		this.id=id;
		this.usage=usage;
	}
	public void setStatus(boolean status) {
		this.status=status;
	}
	public boolean isOn() {
		return status;
	}
	 public double calculateEnergyUsage(double hours) {
	        return usage * hours;
	    }

}
