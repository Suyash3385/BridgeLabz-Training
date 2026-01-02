package com.encapsulation;
import java.util.*;

public class BankMain {

	    public static void processAccounts(List<BankAccount> accounts) {

	        for (BankAccount acc : accounts) {
	            double interest = acc.calculateInterest();
	            System.out.println("Account Holder: " + acc.getHolderName());
	            System.out.println("Interest Earned: " + interest);

	            if (acc instanceof Loanable) {
	                Loanable loanAcc = (Loanable) acc;
	                loanAcc.applyForLoan();
	                System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
	            }

  	        }
	       }

	    public static void main(String[] args) {

	        List<BankAccount> accountList = new ArrayList<>();

	        accountList.add(new SavingsAccount(1001, "Suyash", 50000));
	        accountList.add(new CurrentAccount(2001, "Amit", 100000));

	        processAccounts(accountList);
	    }
	}



