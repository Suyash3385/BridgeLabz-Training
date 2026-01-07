package LoanBuddy;

public class AutoLoan extends LoanApplication {
    public AutoLoan(Applicant applicant, int termInMonths) {
        super(applicant, "Auto Loan", termInMonths, 9);
      }

    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore()>=650 && applicant.getIncome()>=20000){
            setApproval(true);
        }
        return approved;
  }
}

