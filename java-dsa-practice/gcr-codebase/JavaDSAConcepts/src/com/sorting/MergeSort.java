package com.sorting;
import java.util.Scanner;
public class MergeSort {
	


	    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
	        if (left >= right) {
	            return;
	        }
	        int mid = left + (right - left) / 2;

	        mergeSort(arr, left, mid, temp);
	        mergeSort(arr, mid + 1, right, temp);
	        merge(arr, left, mid, right, temp);
	    }

	    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
	        for (int i=left;i<=right; i++) {
	            temp[i] = arr[i];
	        }

	        int i=left;     
	        int j=mid+1;  
	        int k=left;    
	        while (i<=mid&&j<=right){
	            if (temp[i]<=temp[j]) {
	                arr[k++]=temp[i++];
	            }
	            else {
	                arr[k++]=temp[j++];
	         }
	        }
	        while (i<=mid) {
	            arr[k++]=temp[i++];
	    }
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n=sc.nextInt();

	        int[] arr=new int[n];
	        int[] temp=new int[n];

	        System.out.println("Enter elements:");
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        mergeSort(arr, 0, n - 1, temp);
	        System.out.println("Sorted Array:");
	        for(int num:arr){
	            System.out.print(num + " ");
	     }
	     }
	     }



