package com.streams.readuser;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadUser {
	    public static void main(String[] args) {
	        BufferedReader br=null;
	        FileWriter fw=null;
	        try {
	            br=new BufferedReader(new InputStreamReader(System.in));
	            System.out.print("Enter your name: ");
	            String name=br.readLine();
	            System.out.print("Enter your age: ");
	            String age=br.readLine();
	            System.out.print("Enter your programming language: ");
	            String language=br.readLine();
	            fw=new FileWriter("user_info.txt");
	            fw.write("Name: " + name );
	            fw.write("Age: " + age );
	            fw.write("Favorite Programming Language: " +language);
	        } 
	        catch (IOException e){
	            System.out.println("error occurred ");
	            e.printStackTrace();
	        } 
	        finally {
	            try {
	                if(br!=null)
	                    br.close();
	                if (fw!=null)
	                    fw.close();
	            } 
	            catch (IOException e) {
	                e.printStackTrace();
	       }
	     }
	    }
	}



