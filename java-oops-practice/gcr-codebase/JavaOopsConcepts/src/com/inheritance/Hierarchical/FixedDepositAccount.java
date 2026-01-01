package com.inheritance.Hierarchical;

public class FixedDepositAccount extends BankAccount  {
	 int tenure; 
	    double interestRate;

	    public FixedDepositAccount(String accountNumber, double balance, int tenure, double interestRate) {
	        super(accountNumber, balance);
	        this.tenure = tenure;
	        this.interestRate = interestRate;
	    }

	    public void displayAccountType() {
	        System.out.println("Account Type   : Fixed Deposit Account");
	        System.out.println("Tenure         : " + tenure + " months");
	        System.out.println("Interest Rate  : " + interestRate + "%");
	    }

	    @Override
	    public void displayAccountInfo() {
	        super.displayAccountInfo();
	        displayAccountType();
	    }
	}
	


