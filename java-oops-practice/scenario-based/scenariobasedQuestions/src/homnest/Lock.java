package homnest;

public class Lock extends Device  {
	private boolean locked=true;
	Lock(int id,int usage){
		super(id,usage);
		
	}
	public void turnOn() {
		setStatus(true);
		locked=true;
		System.out.println("lock " + id + "turned on");
		
	}
	public void turnOff() {
		setStatus(false);
		locked=false;
		System.out.println("lock" + id + "turned off");
	}
	public void reset() {
		locked=true;
		System.out.println("lock" + id + "reset");
	}

}
