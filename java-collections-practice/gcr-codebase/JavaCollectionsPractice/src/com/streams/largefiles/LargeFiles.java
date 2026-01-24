package com.streams.largefiles;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class LargeFiles {
	    public static void main(String[] args) {
	        BufferedReader br=null;
	        try {
	            br=new BufferedReader(new FileReader("largefile.txt"));
	            String line;
	            while ((line=br.readLine())!=null){
	                if (line.toLowerCase().contains("error")) {
	                    System.out.println(line);
	                }
	            }

	        } 
	        catch (IOException e) {
	            System.out.println("Error ");
	            e.printStackTrace();
	        }
	        finally {
	            try {
	                if (br!=null)
	                    br.close();
	            } 
	            catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}



