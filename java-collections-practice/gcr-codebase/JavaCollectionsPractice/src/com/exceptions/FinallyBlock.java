package com.exceptions;
import java.util.Scanner;
public class FinallyBlock {

 

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        try {
	            System.out.print("Enter1 number: ");
	            int num1=sc.nextInt();
	            System.out.print("Enter2 number: ");
	            int num2=sc.nextInt();
	            int result=num1/num2;
	            System.out.println("Result: " + result);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Cannot divide by zero");

	        } 
	        finally {
	            System.out.println("Operation completed");
	          
	        }
	    }
	}


