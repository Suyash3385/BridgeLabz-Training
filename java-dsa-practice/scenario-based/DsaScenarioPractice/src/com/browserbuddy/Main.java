package com.browserbuddy;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        Browser browser=new Browser();

	        while (true) {
	       
	            System.out.println("1. Open Page");
	            System.out.println("2. Back");
	            System.out.println("3. Forward");
	            System.out.println("4. Close Tab");
	            System.out.println("5. Reopen Closed Tab");
	            System.out.println("6. Current Page");
	            System.out.println("7. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine(); 
	            switch (choice) {
	                case 1:
	                    System.out.print("Enter URL: ");
	                    String url=sc.nextLine();
	                    browser.openPage(url);
	                    break;
	                case 2:
	                    browser.back();
	                    break;
	                case 3:
	                    browser.forward();
	                    break;
	                case 4:
	                    browser.closeTab();
	                    break;
	                case 5:
	                    browser.reopenClosedTab();
	                    break;
	                case 6:
	                    browser.currentPage();
	                    break;
	                case 7:
	                    System.out.println("Exiting BrowserBuddy");
	                    return;
	                default:
	                    System.out.println("Invalid choice");
	       }
	   }
	}
}
