package com.ZipZipMart;

public class SalesReport {
	    public void mergeSort(SalesRecord[] records, int left, int right) {
	        if (left<right) {
	            int mid=(left+right)/2;
	            mergeSort(records, left, mid);
	            mergeSort(records, mid + 1, right);
	            merge(records, left, mid, right);
	     }
	    }
	    private void merge(SalesRecord[] records, int left,int mid,int right) { 
	        int n1 =mid-left + 1;
	        int n2 =right-mid;
	        SalesRecord[] L=new SalesRecord[n1];
	        SalesRecord[] R=new SalesRecord[n2];
	        for (int i=0; i<n1; i++)
	            L[i]=records[left+i];
	        for (int j=0; j<n2;j++)
	            R[j]=records[mid+1+j];
	        int i=0,j=0, k=left;
	        while (i < n1 && j < n2) {
	            int dateCompare=L[i].getDate().compareTo(R[j].getDate());

	            if (dateCompare<0) {
	                records[k++]=L[i++];
	            }
	            else if (dateCompare > 0) {
	                records[k++]=R[j++];
	            }
	            else {
	                if (L[i].getAmount()<=R[j].getAmount()) {
	                    records[k++]=L[i++];
	                } 
	          else {
	             records[k++]=R[j++];
           }
	        }
	        }
	        while (i<n1) {
	            records[k++]=L[i++];
	        }
	        while (j<n2) {
	            records[k++]=R[j++];
	      }
	    }
	    public void printReport(SalesRecord[] records) {
	        for (SalesRecord r : records) {
	            System.out.println(r);
	    }
	    }
	     }


