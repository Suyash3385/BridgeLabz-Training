package com.json.merge;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
public class MergeTwo {
	    public static void main(String[] args) {
	        try {
	            ObjectMapper mapper=new ObjectMapper();
	            String json1="{ \"name\": \"Suyash\", \"email\": \"suyash@gmail.com\" }";
	            String json2="{ \"age\": 21, \"city\": \"Delhi\" }";
	            JsonNode node1=mapper.readTree(json1);
	            JsonNode node2=mapper.readTree(json2);
	            ObjectNode merged=mapper.createObjectNode();
	            merged.setAll((ObjectNode) node1);
	            merged.setAll((ObjectNode) node2);

	            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(merged));

	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


