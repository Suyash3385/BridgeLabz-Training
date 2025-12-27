package com.constructors.levelone;

public class BankAccountMain {
	

	 public static void main(String[] args) {

	        SavingsAccount sa=new SavingsAccount(
	                1234567890L,
	                "Suyash Sharma",
	                50000.0,
	                4.5
	        );

	        sa.displaySavingsAccountDetails();

	     
	        sa.deposit(10000);
	        sa.withdraw(5000);

	        System.out.println("After Transactions:");
	        System.out.println("Updated Balance: " + sa.getBalance());
	    }
	}

    
