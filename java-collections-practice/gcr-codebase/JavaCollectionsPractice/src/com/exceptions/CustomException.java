package com.exceptions;
import java.util.Scanner;
public class CustomException {
	    static class InvalidAgeException extends Exception {
	        public InvalidAgeException(String msg){
	            super(msg);
	      }
	    }
	    public static void validateAge(int age) throws InvalidAgeException{
	        if(age<18) {
	            throw new InvalidAgeException("Age is less than 18");
	        }
	        System.out.println("valid age");
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        try {
	            System.out.print("Enter age: ");
	            int age=sc.nextInt();
	            validateAge(age);
	        } 
	        catch (InvalidAgeException e) {
	            System.out.println("Age must be 18 or above");
	        } 
	    }
	}


