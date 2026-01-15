package payexpress;
import java.time.LocalDate;
public class Main {
	
	 public static void main(String[] args) {

	        Bill eb = new ElectricityBill(1500, LocalDate.now().plusDays(5));
	        Bill wb = new WaterBill(600, LocalDate.now().minusDays(2)); 
	        Bill ib = new InternetBill(900, LocalDate.now().plusDays(3));

	       
	        eb.sendReminder();
	        wb.sendReminder();
	        ib.sendReminder();

	        System.out.println();

	      
	        eb.pay();
	        wb.pay(); 
	        ib.pay();

	        System.out.println();

	     
	        System.out.println("Electricity paid? " + eb.getPaidStatus());
	        System.out.println("Water paid? " + wb.getPaidStatus());
	        System.out.println("Internet paid? " + ib.getPaidStatus());
	    }
	}


