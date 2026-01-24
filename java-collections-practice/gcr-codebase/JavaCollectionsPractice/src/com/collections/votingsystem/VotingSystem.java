package com.collections.votingsystem;
import java.util.*;
public class VotingSystem {

	public static void main(String[] args) {


		        Scanner sc=new Scanner(System.in);
		        HashMap<String, Integer> voteCount=new HashMap<>();
		        LinkedHashMap<Integer, String> voteOrder=new LinkedHashMap<>();
		        System.out.print("Enter number of voters: ");
		        int voters=sc.nextInt();
		        for (int i=1; i<=voters;i++){
		            System.out.print("Enter candidate name for vote " + i + ": ");
		            String candidate=sc.next();
                 voteOrder.put(i, candidate);
		            if (voteCount.containsKey(candidate)) {
		                voteCount.put(candidate, voteCount.get(candidate)+1);
		            } 
		            else {
		                voteCount.put(candidate, 1);
		            }
		        }
		        System.out.println("Voting Order :");
		        for (Map.Entry<Integer,String>entry:voteOrder.entrySet()) {
		            System.out.println("Vote " +entry.getKey() + entry.getValue());
		        }
		        System.out.println("Vote Count :");
		        System.out.println(voteCount);
		        TreeMap<String, Integer> result=new TreeMap<>(voteCount);
		        System.out.println("Sorted Results :");
		        for (Map.Entry<String,Integer>entry:result.entrySet()) {
		            System.out.println(entry.getKey() + entry.getValue());
		        }
		    }
		

		   

	}


