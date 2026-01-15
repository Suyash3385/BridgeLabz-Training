package payexpress;
import java.time.LocalDate;
public abstract class Bill implements IPayable  {
	 private String type;
	    private double amount;
	    private LocalDate dueDate;
	    private boolean isPaid;

	    Bill(String type, double amount, LocalDate dueDate) {
	        this.type = type;
	        this.amount = amount;
	        this.dueDate = dueDate;
	        this.isPaid = false;
	    }

	   
	    Bill(String type, double amount) {
	        this(type, amount, LocalDate.now().plusMonths(1));
	    }

	 
	    public boolean getPaidStatus() {
	        return isPaid;
	    }

	    protected void markAsPaid() {   
	        this.isPaid = true;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public LocalDate getDueDate() {
	        return dueDate;
	    }

	    // Late fee operator-like method
	    public double calculateLateFee() {
	        if (LocalDate.now().isAfter(dueDate)) {
	            double penalty = amount * 0.10; // 10% penalty
	            return amount + penalty;
	        }
	        return amount;
	    }

	    @Override
	    public void pay() {
	        if (isPaid) {
	            System.out.println(type + " Bill is already paid.");
	        } else {
	            double finalAmount = calculateLateFee();
	            System.out.println("Paying " + type + " Bill: ₹" + finalAmount);
	            markAsPaid();
	        }
	    }

	    @Override
	    public abstract void sendReminder(); 
	}



