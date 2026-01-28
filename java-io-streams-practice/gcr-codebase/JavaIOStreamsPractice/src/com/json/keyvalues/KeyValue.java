package com.json.keyvalues;
import java.io.File;
import java.util.Iterator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class KeyValue {

	    public static void main(String[] args) {
	        try {
	            ObjectMapper mapper=new ObjectMapper();
	            JsonNode rootNode=mapper.readTree(new File("data.json"));

	            Iterator<String> fieldNames=rootNode.fieldNames();

	            while (fieldNames.hasNext()) {
	                String key=fieldNames.next();
	                JsonNode value= rootNode.get(key);
	                System.out.println(key + " : " + value.asText());
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}



