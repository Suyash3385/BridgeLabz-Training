package LoanBuddy;

public class HomeLoan extends LoanApplication {
	HomeLoan(Applicant applicant ,int term){
	      super(applicant,"Home Loan",term,7);  
	    }
	   @Override
	    public boolean approveLoan() {
	        if(applicant.getCreditScore()>=700&&applicant.getIncome()>=30000){
	            setApproval(true);
	 }
	        return approved;
    }
	}


