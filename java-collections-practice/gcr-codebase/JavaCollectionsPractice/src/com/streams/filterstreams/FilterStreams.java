package com.streams.filterstreams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class FilterStreams {
	    	public static void main(String[] args) {
	            String inputFile="input.txt";
	            String outputFile="output.txt";
	            BufferedReader br=null;
	            BufferedWriter bw=null;
	            try {
	                br=new BufferedReader(new FileReader(inputFile, StandardCharsets.UTF_8));
	                bw=new BufferedWriter(new FileWriter(outputFile, StandardCharsets.UTF_8));
	                int ch;
	                while ((ch=br.read())!=-1) {
	                    bw.write(Character.toLowerCase((char)ch));
	                }
	                System.out.println("File conversion completed successfully");
	            } 
	            catch (IOException e) {
	                System.out.println("Error while processing the file");
	                e.printStackTrace();
	            } 
	            finally {
	                try {
	                    if (br!=null) br.close();
	                    if (bw!=null) bw.close();
	                } 
	                catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	    }