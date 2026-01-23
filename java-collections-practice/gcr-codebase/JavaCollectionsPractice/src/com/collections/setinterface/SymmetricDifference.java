package com.collections.setinterface;
import java.util.*;
public class SymmetricDifference {
	
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of elements:");
	int n1=sc.nextInt();
	
int arr1[]=new int[n1];
System.out.println("enter elements:");
for(int i=0;i<n1;i++) {
	arr1[i]=sc.nextInt();
}
System.out.println("enter number of elements:");
int n2=sc.nextInt();
int arr2[]=new int[n2];
System.out.println("enter elements:");
for(int i=0;i<n2;i++) {
	arr2[i]=sc.nextInt();
	}
HashSet<Integer> set1=new HashSet<>();
HashSet<Integer> set2=new HashSet<>();
for(int num:arr1) {
	set1.add(num);
}
for(int num:arr2) {
		set2.add(num); 
}
HashSet<Integer> result=new HashSet<>();
for (int num:set1) {
    if (!set2.contains(num)) {
        result.add(num);
    }
}

for (int num:set2) {
    if (!set1.contains(num)) {
        result.add(num);
    }
}
System.out.println("Symmetric Difference: "+result);
	
}
}
