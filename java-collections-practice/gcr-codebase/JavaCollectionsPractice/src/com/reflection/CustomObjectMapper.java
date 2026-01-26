package com.reflection;

	import java.lang.reflect.Field;
	import java.util.HashMap;
	import java.util.Map;

public class CustomObjectMapper{
	    public static <T> T toObject(Class<T> cls, Map<String, Object> properties) {
	        try {
	            T obj=cls.getDeclaredConstructor().newInstance();
	            for (Map.Entry<String, Object> entry:properties.entrySet()) {

	                try {	               
	                    Field field = cls.getDeclaredField(entry.getKey());
	                    field.setAccessible(true);
	                    field.set(obj, entry.getValue());

	                }
	                catch (NoSuchFieldException e) {
	                }
	            }
	            return obj;

	        } 
	        catch (Exception e) {
	            throw new RuntimeException("Object mapping failed", e);
	        }
	    }
	    static class Student {
	        private int id;
	        private String name;
	        private double marks;
	        public void display() {
	            System.out.println(id +  name + marks);
	        }
	    }
	    public static void main(String[] args) {
	        Map<String, Object> data=new HashMap<>();
	        data.put("id", 101);
	        data.put("name", "Suyash");
	        data.put("marks", 89.5);
	        Student student=toObject(Student.class, data);
	        student.display();
	    
	}


}
