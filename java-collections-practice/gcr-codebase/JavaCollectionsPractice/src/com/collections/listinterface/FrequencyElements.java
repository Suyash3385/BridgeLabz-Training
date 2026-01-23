package com.collections.listinterface;
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyElements {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	String[] arr=new String[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextLine();
	}
		
		HashMap<String,Integer> map=new HashMap<>();
		for(String val:arr) {
			map.put(val,map.getOrDefault(val, 0)+1);
		}
		System.out.println("Frequency of string ");
		System.out.println(map);
		
		
	}

}
