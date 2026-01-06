package com.sorting;
import java.util.*;
public class CountingSort {

	public static void  countSort(int arr[]) {
		int min=10,max=18;
		int range=max-min;
		int freq[]=new int[range];
		for(int i=0;i<arr.length;i++) {
			freq[i]++;
		}
		for(int i=1;i<freq.length;i++) {
			freq[i]+=freq[i-1];
		}
		int res[]=new int [arr.length];
		   for (int i = arr.length - 1; i >= 0; i--) {
	            int age = arr[i];
	            int index = freq[i] - 1;
	            res[index] = age;
	            freq[i]--;
	        }

	        
	        for (int i = 0; i <arr.length; i++) {
	            arr[i] = res[i];
	        }
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countSort(arr);
        for (int age : arr) {
            System.out.print(age + " ");
        }
}
}
