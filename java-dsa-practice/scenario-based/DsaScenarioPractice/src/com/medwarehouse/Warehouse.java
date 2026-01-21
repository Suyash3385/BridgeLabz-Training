package com.medwarehouse;

public class Warehouse {
	public void mergeSort(Medicine[]m) {
	      if (m.length<2) return;

	        int mid=m.length/2;
	        Medicine[] left =new Medicine[mid];
	        Medicine[] right=new Medicine[m.length-mid];

	        for (int i=0;i<mid;i++)
	            left[i]=m[i];

	        for (int i=mid;i<m.length; i++)
	            right[i-mid]=m[i];

	        mergeSort(left);
	        mergeSort(right);
	        merge(m,left,right);
	    }

	    private void merge(Medicine[] m, Medicine[] left, Medicine[] right) {
	        int i=0,j=0,k=0;

	        while (i < left.length && j<right.length) {
	            if (left[i].expiry<=right[j].expiry) {
	                m[k++]=left[i++];
	            }
	            else {
	                m[k++]=right[j++];
	            }
	        }
	        while (i<left.length)
	            m[k++]=left[i++];

	        while (j<right.length)
	            m[k++]=right[j++];
	    }
			
		
	}


