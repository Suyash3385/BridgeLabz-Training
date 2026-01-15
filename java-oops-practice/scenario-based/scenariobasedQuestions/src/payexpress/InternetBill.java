package payexpress;
import java.time.LocalDate;
public class InternetBill extends Bill {
	 InternetBill(double amount, LocalDate dueDate) {
	        super("Internet", amount, dueDate);
	    }

	    @Override
	    public void sendReminder() {
	        System.out.println(" Internet Bill Reminder: Avoid disconnection! Due: " + getDueDate());
	    }
}
