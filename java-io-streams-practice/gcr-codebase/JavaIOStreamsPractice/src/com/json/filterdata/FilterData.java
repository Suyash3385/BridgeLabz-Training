package com.json.filterdata;
import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterData {

	    public static void main(String[] args) {
	        try {
	            ObjectMapper mapper=new ObjectMapper();
	            JsonNode rootNode=mapper.readTree(new File("users.json"));

	            for (int i=0;i<rootNode.size(); i++) {
	                JsonNode user=rootNode.get(i);
	                if (user.has("age") && user.get("age").asInt() > 25) {
	                    System.out.println("Name  : " + user.get("name").asText());
	                    System.out.println("Age   : " + user.get("age").asInt());
	                    System.out.println("Email : " + user.get("email").asText());
	        
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


