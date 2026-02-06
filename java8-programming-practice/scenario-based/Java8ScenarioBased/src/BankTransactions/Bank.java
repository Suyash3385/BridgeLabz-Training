package BankTransactions;

	import java.util.HashMap;
	import java.util.Map;

	class Bank {
	    private final Map<Integer, Integer> accounts = new HashMap<>();
	    public Bank() {
	        accounts.put(101, 1000);
	        accounts.put(102, 1500);
	    }

	    public synchronized void deposit(int accountNumber,int amount) {
	        int balance=accounts.get(accountNumber);
	        balance+=amount;
	        accounts.put(accountNumber, balance);

	        System.out.println(Thread.currentThread().getName()+ " deposited " + amount + " into account "+ accountNumber + ". New Balance: " + balance);
	    }
	    public synchronized void withdraw(int accountNumber,int amount) {
	        int balance=accounts.get(accountNumber);
	        if (balance>=amount) {
	            balance-=amount;
	            accounts.put(accountNumber, balance);
	            System.out.println(Thread.currentThread().getName()+ " withdrew " + amount + " from account "+ accountNumber + " New Balance: " + balance);
	        }
	        else {
	            System.out.println(Thread.currentThread().getName()+ " attempted to withdraw " + amount + " but insufficient balance in account "+ accountNumber);
	        }
	    }

	    public synchronized int getBalance(int accountNumber) {
	        return accounts.get(accountNumber);
	    }
	}



