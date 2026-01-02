package Ewallet;


	class BusinessWallet extends Wallet {

	    public BusinessWallet(double balance) {
	        super(balance);
	    }

	    @Override
	    public void transferTo(User receiver, double amount) {

	        double tax = amount * 0.02; 
	        double total = amount + tax;

	        if (debit(total)) {
	            receiver.getWallet().credit(amount);
	            transactions.add(new Transaction("Business transfer (Tax ₹" + tax + ")", amount));
	        }
	    }
	}


