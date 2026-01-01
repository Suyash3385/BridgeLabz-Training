package com.inheritanceHierarchical;

public class BankAcountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		


		        SavingsAccount sa = new SavingsAccount("SA123", 5000, 5);
		        CheckingAccount ca = new CheckingAccount("CA456", 3000, 1000);
		        FixedDepositAccount fda = new FixedDepositAccount("FD789", 10000, 12, 6);

		        sa.displayAccountInfo();
		        System.out.println();

		        ca.displayAccountInfo();
		        System.out.println();

		        fda.displayAccountInfo();
		    }
		


	}


