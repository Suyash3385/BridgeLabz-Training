package com.tailorshop;

public class TailorShop {
	public  void insertionSort(Order[] o) {
		for(int i=1;i<o.length;i++) {
		Order key=o[i];
		int  j=i-1;
		while(j>=0 && o[j].deadline>key.deadline) {
			o[j+1]=o[j];
			j--;
		}
		o[j+1]=key;
		
	}
		

}
}
