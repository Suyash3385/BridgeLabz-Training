package com.constructors.levelone;

public class SavingsAccount extends BankAccount {
	
	 double interestRate;

	    SavingsAccount(long accountNumber, String accountHolder, double balance, double interestRate) {
	        super(accountNumber, accountHolder, balance);
	        this.interestRate=interestRate;
	    }

	 
	    void displaySavingsAccountDetails() {
	        System.out.println("Account Number: " + accountNumber);  
	        System.out.println("Account Holder: " + accountHolder);   
	        System.out.println("Balance: " + getBalance());         
	        System.out.println("Interest Rate: " + interestRate + "%");
	    }
	
}
