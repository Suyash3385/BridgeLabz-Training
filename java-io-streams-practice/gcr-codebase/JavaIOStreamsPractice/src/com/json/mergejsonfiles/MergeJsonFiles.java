package com.json.mergejsonfiles;

	import java.io.File;

	import com.fasterxml.jackson.databind.JsonNode;
	import com.fasterxml.jackson.databind.ObjectMapper;
	import com.fasterxml.jackson.databind.node.ObjectNode;

	public class MergeJsonFiles {

	    public static void main(String[] args) {
	        try {
	            ObjectMapper mapper = new ObjectMapper();

	            // Read both JSON files
	            JsonNode json1 = mapper.readTree(new File("file1.json"));
	            JsonNode json2 = mapper.readTree(new File("file2.json"));

	            // Create merged object
	            ObjectNode mergedJson = mapper.createObjectNode();

	            mergedJson.setAll((ObjectNode) json1);
	            mergedJson.setAll((ObjectNode) json2);

	            // Print merged JSON
	            System.out.println(
	                mapper.writerWithDefaultPrettyPrinter()
	                      .writeValueAsString(mergedJson)
	            );

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


