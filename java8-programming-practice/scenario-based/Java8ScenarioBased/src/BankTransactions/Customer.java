package BankTransactions;

	class Customer extends Thread {

	    private final Bank bank;
	    private final int accountNumber;

	    public Customer(String name, Bank bank, int accountNumber) {
	        super(name);
	        this.bank=bank;
	        this.accountNumber=accountNumber;
	    }
	    public void run() {
	        bank.deposit(accountNumber, 500);
	        bank.withdraw(accountNumber, 300);
	        bank.withdraw(accountNumber, 700);
	    }
	}



