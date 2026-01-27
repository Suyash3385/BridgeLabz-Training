package com.annotations.suppresswarnings;
import java.util.ArrayList;
public class SuppressUnchekedWarnings {
	    @SuppressWarnings("unchecked")
	    public static void main(String[] args) {
	        ArrayList list=new ArrayList();
	        list.add("Java");
	        list.add(100);
	        list.add(25.5);
	        for (int i=0;i<list.size(); i++) {
	            Object obj=list.get(i);
	            System.out.println(obj);
	        }
	    }
	}



