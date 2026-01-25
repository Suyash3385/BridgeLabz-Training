package com.exceptions;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class CheckedExceptions {
	    public static void main(String[] args) {
	        BufferedReader br=null;
	        try {
	            FileReader fr=new FileReader("data.txt");
	            br=new BufferedReader(fr);
	            String line;
	            while((line=br.readLine())!=null) {
	                System.out.println(line);
	            }
	        } 
	        catch (IOException e) {
	            System.out.println("File not found");
	        } 
	        finally {
	            try {
	                if(br!=null) {
	                    br.close();
	                }
	            } 
	            catch (IOException e) {
	                System.out.println("Error closing the file");
	            }
	        }
	    }
	}



