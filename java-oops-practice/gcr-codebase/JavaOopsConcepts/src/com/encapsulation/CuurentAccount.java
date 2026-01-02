package com.encapsulation;


	class CurrentAccount extends BankAccount implements Loanable {

	    public CurrentAccount(long accNo, String name, double balance) {
	        super(accNo, name, balance);
	    }

	    @Override
	    public double calculateInterest() {
	        return getBalance() * 0.01; 
	    }

	    @Override
	    public void applyForLoan() {
	        System.out.println("Loan applied for Current Account");
	    }

	    @Override
	    public double calculateLoanEligibility() {
	        return getBalance() * 10; 
	    }
	}



