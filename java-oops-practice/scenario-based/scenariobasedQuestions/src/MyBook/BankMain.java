package MyBook;

public class BankMain {

	    public static void main(String[] args) {

	        Account acc1 = new SavingsAccount(101, 10000);
	        Account acc2 = new CurrentAccount(102, 20000);

	        acc1.deposit(2000);
	        acc2.withdraw(5000);

	        System.out.println("Savings Balance: " + acc1.checkBalance());
	        System.out.println("Savings Interest: " + acc1.calculateInterest());

	        System.out.println("Current Balance: " + acc2.checkBalance());
	        System.out.println("Current Interest: " + acc2.calculateInterest());
	    }
	}



