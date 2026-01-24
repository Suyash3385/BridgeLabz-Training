package com.collections.mapinterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MergeMaps {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer>map1=new HashMap<>();
		HashMap<String,Integer>map2=new HashMap<>();
		System.out.println("enter number");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++) {
		System.out.println("enter key");
		String s=sc.next();
		System.out.println("enter value");
		int v=sc.nextInt();
		map1.put(s, v);
		}
		
		System.out.println("enter number");
		int n2=sc.nextInt();
		for(int i=0;i<n2;i++) {
		System.out.println("enter key");
		String s=sc.next();
		System.out.println("enter value");
		int v=sc.nextInt();
		map2.put(s, v);
		}
		int sum=0;
		for(Map.Entry<String, Integer>entry: map2.entrySet()) {
			String key=entry.getKey();
			int value=entry.getValue();
			if(map1.containsKey(key)) {
				map1.put(key, map1.get(key)+value);
			}
			else {
				map1.put(key, value);
			}
		}
		System.out.println("merged map : "+map1);
	}

}
