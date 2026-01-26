package com.reflection;


	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;
	import java.lang.annotation.ElementType;

	@Author(name = "Author Name")
	public class Annotation{
	    public static void main(String[] args) {
	        Class<Annotation>cls=Annotation.class;
	       
	        if (cls.isAnnotationPresent(Author.class)) {
	            Author author=cls.getAnnotation(Author.class);
	            System.out.println("Author Name: " + author.name());
	        }
     	    }
	      }
	@Retention(RetentionPolicy.RUNTIME)  
	@Target(ElementType.TYPE)            
	@interface Author {
	    String name();
	}



