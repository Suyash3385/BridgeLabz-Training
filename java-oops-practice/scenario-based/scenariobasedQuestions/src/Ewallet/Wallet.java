package Ewallet;


	import java.util.ArrayList;
	import java.util.List;

	abstract class Wallet implements Transferrable {

	    private double balance;   
	    protected List<Transaction> transactions = new ArrayList<>();

	    public Wallet(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    protected void credit(double amount) {
	        balance += amount;
	    }

	    protected boolean debit(double amount) {
	        if (amount > balance) return false;
	        balance -= amount;
	        return true;
	    }

	    public void showTransactions() {
	        for (Transaction t : transactions) {
	            System.out.println(t.getDetails());
	        }
	    }
	}


