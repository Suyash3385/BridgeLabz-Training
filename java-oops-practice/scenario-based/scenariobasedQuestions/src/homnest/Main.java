package homnest;

public class Main {
public static void main(String[]args) {
	

	        User user = new User("Suyash");

	        Device light = new Light(1, 12);
	        Device cam = new Camera(2, 5);
	       
	        Device lock = new Lock(4, 3);

	        user.registerDevice(light);
	        user.registerDevice(cam);
	      
	        user.registerDevice(lock);

	        light.turnOn();
	        cam.turnOn();
	        
	        lock.turnOn();

	        System.out.println();
	        light.reset();
	        cam.reset();
	        lock.reset();
	        System.out.println();

	        System.out.println("Energy used by Light for 5 hours: " + light.calculateEnergyUsage(5) + " Wh");
	    }
	}


