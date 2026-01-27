package com.annotations.pendingtask;
import java.lang.reflect.Method;
public class Main {

	    public static void main(String[] args) {
	        Class projectClass=ProjectTasks.class;
	        Method[] methods=projectClass.getDeclaredMethods();
	        for (int i=0;i<methods.length; i++) {
	            Method method=methods[i];
	            if (method.isAnnotationPresent(Todo.class)) {
	                Todo todo=method.getAnnotation(Todo.class);
	                System.out.println("Method Name : " + method.getName());
	                System.out.println("Task        : " + todo.task());
	                System.out.println("Assigned To : " + todo.assignedTo());
	                System.out.println("Priority    : " + todo.priority());
	      }
	     }
	    }
	   }


