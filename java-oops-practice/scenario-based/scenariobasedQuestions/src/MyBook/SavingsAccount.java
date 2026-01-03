package MyBook;
	
	public class SavingsAccount extends Account {

	    private static final double INTEREST_RATE = 4.0;

	    public SavingsAccount(int accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    @Override
	    public double calculateInterest() {
	        return getBalance() * INTEREST_RATE / 100;
	    }
	}


