package com.collections.mapinterface;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;

	public class InvertMap {
	    public static void main(String[] args) {
	        Map<String, Integer> map=new HashMap<String, Integer>();
	        map.put("A", 1);
	        map.put("B", 2);
	        map.put("C", 1);
	        Map<Integer,List<String>>invertedMap=new HashMap<Integer,List<String>>();
	        for (Map.Entry<String,Integer>entry:map.entrySet()){
	            String key=entry.getKey();
	            Integer value=entry.getValue();
	            if(invertedMap.containsKey(value)){
	                invertedMap.get(value).add(key);
	            }
	            else {
	                List<String>list=new ArrayList<String>();
	                list.add(key);
	                invertedMap.put(value,list);
	            }
	        }

	        System.out.println(invertedMap);
	    }
	}


