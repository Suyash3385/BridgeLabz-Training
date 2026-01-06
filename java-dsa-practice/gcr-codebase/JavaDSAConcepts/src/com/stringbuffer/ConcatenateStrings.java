package com.stringbuffer;
import java.util.*;
public class ConcatenateStrings {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String []arr= new String[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
		}
		StringBuffer sb=new StringBuffer();
		for(String str:arr) {
			sb.append(str);
		}
		System.out.println("concatenated string :" + sb.toString());
	}

}
