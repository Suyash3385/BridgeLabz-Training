package com.json.filter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FilterJson {

	    public static void main(String[] args) {
	        try {
	            ObjectMapper mapper = new ObjectMapper();

	            String json="["+ "{ \"name\":\"Amit\", \"age\":22, \"email\":\"amit@test.com\" },"+ "{ \"name\":\"Suyash\", \"age\":28, \"email\":\"suyash@test.com\" },"+ "{ \"name\":\"Ravi\", \"age\":30, \"email\":\"ravi@test.com\" }"+ "]";

	            JsonNode rootNode=mapper.readTree(json);
	            for (int i = 0;i<rootNode.size();i++) {
	                JsonNode node=rootNode.get(i);

	                if (node.has("age") && node.get("age").asInt() > 25) {
	                    System.out.println("Name  : " + node.get("name").asText());
	                    System.out.println("Age   : " + node.get("age").asInt());
	                    System.out.println("Email : " + node.get("email").asText());
	             
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


