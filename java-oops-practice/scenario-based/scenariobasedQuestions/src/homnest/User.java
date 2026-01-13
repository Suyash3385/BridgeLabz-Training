package homnest;

public class User {
	

	    String name;
	    public User(String name) {
	        this.name=name;
	        System.out.println("User Registered: " + name);
	    }
	    public void registerDevice(Device d) {
	        System.out.println("Device Registered: " + d.id);
	    }
	}



