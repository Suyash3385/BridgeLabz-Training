package Ewallet;


	
	class PersonalWallet extends Wallet {

	    private static final double TRANSFER_LIMIT = 5000;

	    public PersonalWallet(double balance) {
	        super(balance);
	    }

	  
	    public void transferTo(User receiver, double amount) {

	        if (amount > TRANSFER_LIMIT) {
	            System.out.println("Transfer limit exceeded!");
	            return;
	        }

	        if (debit(amount)) {
	            receiver.getWallet().credit(amount);
	            transactions.add(new Transaction("Transferred to " + receiver.getName(), amount));
	        }
	    }
	}



