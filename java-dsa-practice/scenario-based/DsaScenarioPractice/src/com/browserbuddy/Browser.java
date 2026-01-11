package com.browserbuddy;
import java.util.Stack;
public class Browser {

	    BrowserTab tab;
	    Stack<String> closedTabs=new Stack<>();
	   public Browser() {
	        tab=new BrowserTab();
	    }

	    public void openPage(String url) {
	        tab.visit(url);
	        System.out.println("Opened: " + url);
	    }

	    public void back() {
	        tab.back();
	        System.out.println("Current Page: " + tab.getCurrentPage());
	    }

	    public void forward() {
	        tab.forward();
	        System.out.println("Current Page: " + tab.getCurrentPage());
	    }

	    public void closeTab() {
	        String closed = tab.closeTab();
	        if (closed != null) {
	            closedTabs.push(closed);
	            System.out.println("Closed Tab: " + closed);
	            tab=new BrowserTab(); 
	     }
	    }
	    public void reopenClosedTab() {
	        if (closedTabs.isEmpty()) {
	            System.out.println("No recently closed tabs!");
	            return;
	        }
	        String url = closedTabs.pop();
	        tab = new BrowserTab();
	        tab.visit(url);
	        System.out.println("Reopened Tab: " + url);
	    }

	    public void currentPage() {
	        System.out.println("Current Page: " + tab.getCurrentPage());
	    }
	}



