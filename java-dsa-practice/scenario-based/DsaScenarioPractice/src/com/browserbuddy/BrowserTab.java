package com.browserbuddy;
public class BrowserTab {
	private PageNode current;
	public void visit(String url) {
		PageNode newPage =new PageNode(url);
		if(current!=null) {
			current.next=newPage;
			newPage.prev=current;
   }
		current=newPage;
	}
	 public void back() {
	        if (current==null||current.prev==null) {
	            System.out.println("No previous page!");
	            return;
	     }
	        current=current.prev;
	    }
	    public void forward() {
	        if (current==null||current.next==null) {
	            System.out.println("No forward page!");
	            return;
	        }
	        current=current.next;
	    }
	    public String getCurrentPage() {
	        return (current!=null) ? current.url : "No Page";
	    }
	    public String closeTab(){
	        if (current==null) return null;
	        return current.url;
    }
	}


