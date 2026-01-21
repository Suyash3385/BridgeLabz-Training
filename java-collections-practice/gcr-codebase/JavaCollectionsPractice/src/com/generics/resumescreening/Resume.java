package com.generics.resumescreening;


public class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName=candidateName;
        this.jobRole=jobRole;
    }
    public void processResume() {
        System.out.println( "Screening resume of " + candidateName + " for role: " + jobRole.getRoleName());
    }
    public T getJobRole() {
        return jobRole;
    }
}

