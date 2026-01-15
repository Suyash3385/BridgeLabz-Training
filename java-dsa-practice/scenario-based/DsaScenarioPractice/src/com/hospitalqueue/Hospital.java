package com.hospitalqueue;

public class Hospital {
	public void getByCriticality(Patient [] patients) {
		int n=patients.length;
		boolean swap=false;
		
		for(int i=0;i<n-1;i++) {
		 for(int j=0;j<n-i-1;j++) {
			 if(patients[j].getCritical()>patients[j+1].getCritical()) {
				 Patient temp=patients[j];
				 patients[j]=patients[j+1];
				 patients[j+1]=temp;
				 swap=true;
				 
			 }
		 }
		 if(!swap) break;
		}
	}

}
