package MyBook;

	public abstract class Account implements ITransaction {

	    protected int accountNumber;     
	    private double balance;          

	    public Account(int accountNumber) {
	        this.accountNumber = accountNumber;
	        this.balance = 0;
	    }

	 
	    public Account(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }
    protected double getBalance() {
	        return balance;
	    }

	    protected void setBalance(double balance) {
	        this.balance = balance;
	    }

	  
	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    @Override
	    public double checkBalance() {
	        return balance;
	    }

	    public abstract double calculateInterest();
	}



