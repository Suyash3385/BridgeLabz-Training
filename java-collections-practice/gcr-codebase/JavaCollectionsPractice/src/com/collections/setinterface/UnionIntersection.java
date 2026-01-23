package com.collections.setinterface;
import java.util.*;
public class UnionIntersection {

	public static Set<Integer> Union(Set<Integer>set1,Set <Integer> set2){
		Set<Integer> union=new HashSet<>(set1);
		union.addAll(set2);
		return union;
		
	}
	 public static Set<Integer>Intersection(Set<Integer> set1, Set<Integer> set2) {
	        Set<Integer> intersection = new HashSet<>(set1);
	        intersection.retainAll(set2);
	        return intersection;
	    }
	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("Enter number of elements in Set1: ");
	        int n1=sc.nextInt();
	        Set<Integer> set1=new HashSet<>();
	        System.out.println("Enter elements of Set1:");
	        for (int i=0;i<n1;i++) {
	            set1.add(sc.nextInt());
	        }
	        System.out.print("Enter number of elements in Set2: ");
	        int n2=sc.nextInt();
	        Set<Integer>set2=new HashSet<>();
	        System.out.println("Enter elements of Set2:");
	        for (int i=0;i<n2;i++) {
	            set2.add(sc.nextInt());
	        }
	        Set<Integer>union=Union(set1, set2);
	        Set<Integer>intersection=Intersection(set1, set2);
	        System.out.println("Set1: " + set1);
	        System.out.println("Set2: " + set2);
	        System.out.println("Union: " + union);
	        System.out.println("Intersection: " + intersection);

}
}
