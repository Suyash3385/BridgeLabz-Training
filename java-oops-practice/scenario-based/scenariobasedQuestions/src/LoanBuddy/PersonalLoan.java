package LoanBuddy;

class PersonalLoan extends LoanApplication {

    public PersonalLoan(Applicant applicant, int term) {
        super(applicant,"Personal Loan", term, 12);
    }
    @Override
    public boolean approveLoan() {
        if (applicant.getCreditScore() >= 600 && applicant.getIncome() >= 15000) {
            setApproval(true);
   }
        return approved;
 }
}

