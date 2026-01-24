package com.collections.bankingsystem;
	import java.util.*;
	public class BankingSystem {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        HashMap<Integer,Integer>accounts=new HashMap<>();
	        System.out.print("Enter number of customers: ");
	        int n=sc.nextInt();
	        for (int i=0;i<n;i++) {
	            System.out.print("Enter account number: ");
	            int acc=sc.nextInt();
	            System.out.print("Enter balance: ");
	            int balance=sc.nextInt();
	            accounts.put(acc, balance);
	        }
	        Queue<Integer> withdrawalQueue=new LinkedList<>();
	        System.out.print("Enter number of withdrawal requests: ");
	        int w=sc.nextInt();
	        for (int i=0;i<w;i++) {
	            System.out.print("Enter account number for withdrawal: ");
	            withdrawalQueue.add(sc.nextInt());
	        }
	        while (!withdrawalQueue.isEmpty()) {
	            int accNo=withdrawalQueue.poll();
	            if (accounts.containsKey(accNo)) {
	                int currentBalance = accounts.get(accNo);
	                System.out.print("Enter withdrawal amount for account " + accNo );
	                int amount=sc.nextInt();
	                if (amount<=currentBalance) {
	                    accounts.put(accNo, currentBalance-amount);
	                    System.out.println("Withdrawal successful. Remaining balance: " + accounts.get(accNo));
	                } 
	                else {
	                    System.out.println("Insufficient balance for account "+accNo);
	                }
	            } 
	            else {
	                System.out.println("Invalid account number: " + accNo);
	            }
	        }
	        TreeMap<Integer,List<Integer>>sortedByBalance=new TreeMap<>();
	        for (Map.Entry<Integer,Integer>entry:accounts.entrySet()){
	            int accNo=entry.getKey();
	            int balance=entry.getValue();
	            if (sortedByBalance.containsKey(balance)) {
	                sortedByBalance.get(balance).add(accNo);
	            }
	            else {
	                List<Integer>list=new ArrayList<>();
	                list.add(accNo);
	                sortedByBalance.put(balance, list);
	            }
	        }
	        System.out.println("Customers Sorted by Balance:");
	        for (Map.Entry<Integer, List<Integer>> entry:sortedByBalance.entrySet()) {
	            for (int accNo:entry.getValue()){
	                System.out.println("Account: " +accNo+ "  Balance: " + entry.getKey());
	            }
	        }
	    }
	}


