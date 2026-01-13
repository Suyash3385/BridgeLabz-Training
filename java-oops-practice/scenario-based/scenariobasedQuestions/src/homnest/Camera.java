package homnest;

public class Camera extends Device{
	private boolean recording=false;
	Camera(int id,int usage){
		super(id,usage);
		
	}
	public void turnOn() {
		setStatus(true);
		recording=true;
		System.out.println("camera" + id + "turned on");
	}
	public void turnOff() {
		setStatus(false);
		recording=false;
		System.out.println("camera" + id + "turned off");
	}
	public void reset() {
		recording=false;
		System.out.println("camera" + id + "reset");
	}

}
