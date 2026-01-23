package com.collections.setinterface;
import java.util.Set;
import java.util.Scanner;
import java.util.HashSet;
public class EqualSets {
public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
     System.out.print("Enter number of elements for Set1: ");
     int n1=sc.nextInt();
     int arr1[]=new int[n1];
     System.out.println("Enter elements of Set1:");
     for (int i=0;i<n1;i++) {
         arr1[i]=sc.nextInt();
        }
     HashSet<Integer> set1=new HashSet<>();
     for (int num:arr1) {
         set1.add(num);
     }
     System.out.print("Enter number of elements for Set2: ");
     int n2=sc.nextInt();
     int arr2[]=new int[n2];
     System.out.println("Enter elements of Set2:");
     for (int i=0;i<n2;i++) {
         arr2[i]=sc.nextInt();
     }
     HashSet<Integer>set2=new HashSet<>();
     for (int num:arr2) {
         set2.add(num);
     }
     boolean areEqual=set1.equals(set2);
     System.out.println("Are both sets equal? " +areEqual);

 }
}

