package LoanBuddy;

public abstract class LoanApplication implements IApprovable {
	 protected Applicant applicant;
	protected String loanType;
	protected int term;
	protected int interestRate;
    protected boolean approved=false;   

    public LoanApplication(Applicant applicant, String loanType, int term, int interestRate) {
        this.applicant=applicant;
        this.loanType=loanType;
        this.term=term;
        this.interestRate=interestRate;
    }
    
    public double calculateEMI(){
        double P=applicant.getLoanAmount();
        double R=interestRate/(12*100);  
        int N=term;

        double numerator=P*R*Math.pow(1+R,N);
        double denominator=Math.pow(1+R,N)-1;
        return numerator/denominator;
    }
    protected void setApproval(boolean value){
        this.approved=value;
    }
    public boolean isApproved(){
        return approved;
    }

	


}
