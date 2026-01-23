package com.collections.listinterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class RotateList {
	    public static void rotateLeft(List<Integer> list, int k) {
	        int size=list.size();
	        k=k%size;
	        List<Integer>temp=new ArrayList<>();
	        for (int i=0;i<k;i++) {
	            temp.add(list.get(i));
	        }
	        for (int i=k;i<size;i++) {
	            list.set(i-k,list.get(i));
	        }
	        for (int i=0;i<temp.size();i++) {
	            list.set(size-k+i,temp.get(i));
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        List<Integer> list=new ArrayList<>();
	        System.out.println("Enter elements:");
	        for (int i=0;i<n;i++) {
	            list.add(sc.nextInt());
	        }
	        System.out.print("Rotate by positions: ");
	        int k=sc.nextInt();
	        rotateLeft(list, k);
	        System.out.println("Rotated List: " + list);

	    }
	}



