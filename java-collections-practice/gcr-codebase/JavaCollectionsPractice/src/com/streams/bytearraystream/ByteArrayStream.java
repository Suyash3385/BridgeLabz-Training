package com.streams.bytearraystream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
public class ByteArrayStream {
	    public static void main(String[] args) {
	        FileInputStream fis=null;
	        ByteArrayOutputStream baos=null;
	        ByteArrayInputStream bais=null;
	        FileOutputStream fos=null;
	        try {
	            File inputImage=new File("input.jpg");
	            File outputImage=new File("output.jpg");
	            fis=new FileInputStream(inputImage);
	            baos=new ByteArrayOutputStream();
	            byte[] buffer=new byte[4096];
	            int bytesRead;
	            while ((bytesRead=fis.read(buffer))!=-1) {
	                baos.write(buffer, 0, bytesRead);
	            }
	            byte[] imageBytes=baos.toByteArray();
	            bais=new ByteArrayInputStream(imageBytes);
	            fos=new FileOutputStream(outputImage);
	            while ((bytesRead=bais.read(buffer))!=-1) {
	                fos.write(buffer, 0, bytesRead);
	            }
	            System.out.println("Image successfully copied");
	            boolean isIdentical=verifyFiles(inputImage, outputImage);
	            System.out.println("Images identical: " +isIdentical);
	        } 
	        catch (IOException e) {
	            System.out.println("error occurred");
	            e.printStackTrace();
	        } 
	        finally {
	            try {
	                if (fis!=null) fis.close();
	                if (baos!=null) baos.close();
	                if (bais!=null) bais.close();
	                if (fos!=null) fos.close();
	            }
	            catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    private static boolean verifyFiles(File f1, File f2) throws IOException {
	        if (f1.length()!=f2.length()) {
	            return false;
	        }
	        try (FileInputStream fis1=new FileInputStream(f1);
	             FileInputStream fis2=new FileInputStream(f2)) {
	            byte[]b1=fis1.readAllBytes();
	            byte[]b2=fis2.readAllBytes();
	            return Arrays.equals(b1, b2);
	        }
	    }
	}



