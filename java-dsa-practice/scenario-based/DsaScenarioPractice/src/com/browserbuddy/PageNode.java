package com.browserbuddy;

public class PageNode {
	String url;
	PageNode next,prev;
	PageNode(String url){
		this.url=url;
		this.next=null;
		this.prev=null;
}
}
