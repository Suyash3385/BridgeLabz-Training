package Artify;
public class Main {
	    public static void main(String[] args) {
	        User u1 = new User("Suyash", 1000);
	        User u2 = new User("Riya", 300);

	        ArtWork digital1=new DigitalArt("Dreamscape","Alice", 500,"Standard License");
	        ArtWork print1=new PrintArt("Mountain Prints", "Bob", 200, "Print License");

	        digital1.purchase(u1);    
	        print1.purchase(u2);      
	    
	        digital1.license();          
	        print1.license();          
	   
	        System.out.println(u1.getName() + " balance: " + u1.getBalance());
	        System.out.println(u2.getName() + " balance: " + u2.getBalance());
	  }
	}


