package com.json.csvtojson;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	import com.fasterxml.jackson.databind.ObjectMapper;

	public class CsvToJson {

	    public static void main(String[] args) {
	        BufferedReader br = null;

	        try {
	            br = new BufferedReader(new FileReader("users.csv"));

	            String line;
	            String[] headers = br.readLine().split(",");

	            List<Map<String, String>> jsonList =
	                    new ArrayList<Map<String, String>>();

	            while ((line = br.readLine()) != null) {
	                String[] values = line.split(",");

	                Map<String, String> obj =
	                        new HashMap<String, String>();

	                for (int i = 0; i < headers.length; i++) {
	                    obj.put(headers[i], values[i]);
	                }

	                jsonList.add(obj);
	            }

	            ObjectMapper mapper = new ObjectMapper();
	            String json =
	                    mapper.writerWithDefaultPrettyPrinter()
	                          .writeValueAsString(jsonList);

	            System.out.println(json);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}


