package com.collections.listinterface;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class RemoveElements {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();

	        List<Integer> inputList = new ArrayList<>();

	        System.out.println("Enter elements:");
	        for (int i = 0; i < n; i++) {
	            inputList.add(sc.nextInt());
	        }
	        Set<Integer>seen=new HashSet<>();
List<Integer> res=new ArrayList<>();
for(int value:inputList) {
	if(!seen.contains(value)) {
		seen.add(value);
		res.add(value);
	}
}
System.out.println("elements after removing duplicates");
System.out.println(res);

	}

}
