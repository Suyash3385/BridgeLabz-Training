package com.collections.mapinterface;
import java.util.*;
public class HighestFrequency {
	public static void main(String[]args) {	
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer>map=new HashMap<>();
		System.out.println("enter number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("enter key");
		String s=sc.next();
		System.out.println("enter value");
		int v=sc.nextInt();
		map.put(s, v);
		}
		String maxKey=null;
int max=Integer.MIN_VALUE;
for(Map.Entry<String,Integer>entry: map.entrySet()) {
	if(entry.getValue()>max) {
		max=entry.getValue();
		maxKey=entry.getKey();
	}
}
System.out.println("key with max value: "
		+ ""+ maxKey+ " and value is :"+ max);
		
	}

}
