package LoanBuddy;

public class Main {
	    public static void main(String[] args){
	        Applicant a1=new Applicant("Rohit", 720, 45000, 500000);

	        LoanApplication loan=new HomeLoan(a1,240);  
	        boolean status=loan.approveLoan();
	        double emi=loan.calculateEMI();
	        System.out.println("Loan Type: " + loan.loanType);
	        System.out.println("Applicant: " + a1.getName());
	        System.out.println("Approval Status: " + status);
	        System.out.println("Monthly EMI: " + emi);
	 }
	}



