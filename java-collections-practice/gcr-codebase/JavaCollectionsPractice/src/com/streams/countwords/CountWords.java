package com.streams.countwords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class CountWords {
	    public static void main(String[] args) {
	        BufferedReader br=null;
	        HashMap<String,Integer> wordCountMap=new HashMap<String, Integer>();
	        try {
	            br=new BufferedReader(new FileReader("input.txt"));
	            String line;
	            int totalWords=0;
	            while ((line=br.readLine()) != null) {
	                line=line.replaceAll("[^a-zA-Z ]", "").toLowerCase();
	                String[] words=line.split("\\s+");
	                for (int i=0;i<words.length; i++) {
	                    if (!words[i].equals("")){
	                        totalWords++;
	                        if (wordCountMap.containsKey(words[i])) {
	                            wordCountMap.put(words[i], wordCountMap.get(words[i]) + 1);
	                        } 
	                        else {
	                            wordCountMap.put(words[i], 1);
	                        }
	                    }
	                }
	            }

	            System.out.println("Total Words: " + totalWords);
	            List<Map.Entry<String, Integer>> list=new ArrayList<Map.Entry<String, Integer>>(wordCountMap.entrySet());
	            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	                public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
	                    return e2.getValue() - e1.getValue();
	                }
	            });
	            int count=0;
	            for (Map.Entry<String, Integer> entry:list) {
	                System.out.println(entry.getKey() + entry.getValue());
	                count++;
	                if (count==5)
	                    break;
	            }
	        }
	        catch (IOException e) {
	            System.out.println("Error");
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


