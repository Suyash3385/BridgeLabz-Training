package homnest;

public class Light extends Device{
	private int brightness=50;
	Light(int id,int usage){
		super(id,usage);
	}
	public void turnOn() {
		setStatus(true);
		System.out.println("light" + id + "turned on");
	}
	public void turnOff() {
		setStatus(false);
		System.out.println("light" + id + "turned off");
	}
	public void reset() {
		brightness=50;
		System.out.println("light" + id + "brightness is set to 50%");
	}

}
