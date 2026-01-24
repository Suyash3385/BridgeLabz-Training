package com.collections.mapinterface;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class WordFrequency {
	    public static void main(String[] args) {

	        String filePath = "input.txt"; 
	        HashMap<String,Integer> wordCountMap=new HashMap<String, Integer>();
	        BufferedReader br=null;
	        try {
	            br=new BufferedReader(new FileReader(filePath));
	            String line;
	            while ((line=br.readLine()) != null) {
	                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");
	                String[] words = line.split("\\s+");

	                for (String word : words) {
	                    if (word.length() == 0)
	                        continue;

	                    if (wordCountMap.containsKey(word)) {
	                        wordCountMap.put(word, wordCountMap.get(word) + 1);
	                    } else {
	                        wordCountMap.put(word, 1);
	                    }
	                }
	            }
	            System.out.println(wordCountMap);

	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (br != null)
	                    br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}

