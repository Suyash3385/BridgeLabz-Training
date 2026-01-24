package com.collections.shoppingcart;	
	import java.util.*;
	public class ShoppingCart {
	    public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        HashMap<String,Integer>map=new HashMap<>();
	        System.out.print("Enter number of products: ");
	        int p=sc.nextInt();
	        for (int i=0;i<p;i++) {
	            System.out.print("Enter product name: ");
	            String product=sc.next();
	            System.out.print("Enter price: ");
	            int price=sc.nextInt();
	            map.put(product,price);
	        }
	        LinkedHashMap<String,Integer>cart=new LinkedHashMap<>();

	        System.out.print("Enter number of items to add to cart: ");
	        int n=sc.nextInt();
	        for (int i=0;i<n;i++) {
	            System.out.print("Enter product name to add: ");
	            String product=sc.next();
	            if (map.containsKey(product)) {
	                cart.put(product,map.get(product));
	            }
	            else {
	                System.out.println("Product not found!");
	                i--;
	         }
	        }
	        System.out.println("Cart Items :");
	        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
	            System.out.println(entry.getKey() +  entry.getValue());
	        }
	        TreeMap<Integer,List<String>>sortedByPrice=new TreeMap<>();
	        for (Map.Entry<String,Integer>entry:cart.entrySet()){
	            int price=entry.getValue();
	            String product=entry.getKey();
	            if (sortedByPrice.containsKey(price)) {
	                sortedByPrice.get(price).add(product);
	            } 
	            else {
	                List<String> list=new ArrayList<>();
	                list.add(product);
	                sortedByPrice.put(price, list);
	           }
	        }
	        System.out.println("Cart Items Sorted by Price:");
	        for (Map.Entry<Integer,List<String>>entry:sortedByPrice.entrySet()){
	            for (String product:entry.getValue()){
	                System.out.println(product +  entry.getKey());
	            }
	        }
	    }
	}



