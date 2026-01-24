package com.streams.filehandling;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;
	public class ReadWriteFile {
	    public static void main(String[] args) {
	        File sourceFile=new File("source.txt");
	        File destinationFile=new File("destination.txt");
	        FileInputStream fis=null;
	        FileOutputStream fos=null;
	        try {
	            if (!sourceFile.exists()){
	                System.out.println("Source file does not exist");
	                return;
	            }
	            fis=new FileInputStream(sourceFile);
	            fos=new FileOutputStream(destinationFile); 
	            int data;
	            while ((data=fis.read())!=-1) {
	                fos.write(data);
	            }
	            System.out.println("File copied successfully");
	        } 
	        catch (IOException e) {
	            System.out.println("IOException occurred: " + e.getMessage());
	        }
	        finally {
	            try {
	                if (fis!=null)
	                    fis.close();
	                if (fos!=null)
	                    fos.close();
	            } 
	            catch (IOException e) {
	                System.out.println("Error while closing files");
	            }
	        }
	    }
	}


