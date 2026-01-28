package com.json.readfile;

import java.io.File;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
public class ReadFile {

	    public static void main(String[] args) {
	        try {
	            ObjectMapper mapper=new ObjectMapper();
	            JsonNode rootNode=mapper.readTree(new File("user.json"));
	            String name=rootNode.get("name").asText();
	            String email=rootNode.get("email").asText();
	            System.out.println("Name  : " + name);
	            System.out.println("Email : " + email);

	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


