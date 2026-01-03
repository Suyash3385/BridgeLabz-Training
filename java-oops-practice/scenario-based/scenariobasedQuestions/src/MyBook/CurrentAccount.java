package MyBook;	
	public class CurrentAccount extends Account {

	    private static final double INTEREST_RATE = 2.0; 

	    public CurrentAccount(int accountNumber, double balance) {
	        super(accountNumber, balance);
	    }

	    @Override
	    public double calculateInterest() {
	        return getBalance() * INTEREST_RATE / 100;
	    }
	}


