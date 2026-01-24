package com.streams.bufferedstreams;
import java.io.*;
public class EfficientFile {
	    private static final int BUFFER_SIZE = 4096; 

	    public static void main(String[] args) {
	        File source=new File("largefile.dat");
	        File destUnbuffered=new File("copy_unbuffered.dat");
	        File destBuffered=new File("copy_buffered.dat");
	        if(!source.exists()){
	            System.out.println("Source file does not exist");
	            return;
	        }
	        copyUsingUnbufferedStreams(source, destUnbuffered);
	        copyUsingBufferedStreams(source, destBuffered);
	    }
	    private static void copyUsingUnbufferedStreams(File src, File dest) {
	        long startTime=System.nanoTime();
	        try (FileInputStream fis=new FileInputStream(src);
	             FileOutputStream fos=new FileOutputStream(dest)) {
	            byte[] buffer=new byte[BUFFER_SIZE];
	            int bytesRead;
	            while ((bytesRead=fis.read(buffer))!=-1) {
	                fos.write(buffer, 0, bytesRead);
	            }
	        } 
	        catch(IOException e){
	            System.out.println("Unbuffered copy error: " + e.getMessage());
	        }
	        long endTime=System.nanoTime();
	        System.out.println("Unbuffered Streams Time: "+ (endTime - startTime) /1_000_000 );
	    }
	    private static void copyUsingBufferedStreams(File src, File dest) {
	        long startTime=System.nanoTime();
	        try (BufferedInputStream bis=new BufferedInputStream(new FileInputStream(src));
	             BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream(dest))) {
	            byte[] buffer=new byte[BUFFER_SIZE];
	            int bytesRead;
	            while ((bytesRead = bis.read(buffer)) != -1) {
	                bos.write(buffer, 0, bytesRead);
	         }
	        } 
	        catch (IOException e){
	            System.out.println("Buffered copy error: " + e.getMessage());
	        }
	        long endTime=System.nanoTime();
	        System.out.println("Buffered Streams Time: " +(endTime-startTime)/1_000_000 );
	    }
	}



