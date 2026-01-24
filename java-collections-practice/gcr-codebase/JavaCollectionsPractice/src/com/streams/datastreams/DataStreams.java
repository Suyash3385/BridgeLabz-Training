package com.streams.datastreams;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class DataStreams {
	    public static void main(String[] args) {
	        DataOutputStream dos=null;
	        DataInputStream dis=null;
	        try {
	            dos=new DataOutputStream(new FileOutputStream("student.dat"));
	            int rollNumber=101;
	            String name="Suyash Sharma";
	            double gpa=8.75;
	            dos.writeInt(rollNumber);   
	            dos.writeUTF(name);         
	            dos.writeDouble(gpa);      
	            dis=new DataInputStream(new FileInputStream("student.dat"));
	            int r=dis.readInt();
	            String n=dis.readUTF();
	            double g=dis.readDouble();

	            System.out.println("Roll Number: " + r);
	            System.out.println("Name: " + n);
	            System.out.println("GPA: " + g);

	        } 
	        catch (IOException e) {
	            System.out.println("I/O error occurred");
	            e.printStackTrace();
	        } 
	        finally {
	            try {
	                if (dos!=null)
	                    dos.close();
	                if (dis!=null)
	                    dis.close();
	            } 
	            catch (IOException e) {
	                e.printStackTrace();
	         }
	        }
	       }
	    }



