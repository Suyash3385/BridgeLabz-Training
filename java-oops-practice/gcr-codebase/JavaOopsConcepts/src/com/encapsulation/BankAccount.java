package com.encapsulation;


	abstract class BankAccount {

	    private long accountNumber;
	    private String holderName;
	    private double balance;

	    public BankAccount(long accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	 
	    public long getAccountNumber() {
	        return accountNumber;
	    }

	    public String getHolderName() {
	        return holderName;
	    }

	    protected double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	 
	    public abstract double calculateInterest();
	}



