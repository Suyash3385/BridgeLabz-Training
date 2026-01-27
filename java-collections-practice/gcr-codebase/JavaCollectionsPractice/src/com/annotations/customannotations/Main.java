package com.annotations.customannotations;
import java.lang.reflect.Method;
public class Main {
    
	    public static void main(String[] args) throws Exception {
	        Class taskClass=TaskManager.class;
	        Method method=taskClass.getMethod("completeTask");
	        if (method.isAnnotationPresent(TaskInfo.class)) {
	            TaskInfo taskInfo=method.getAnnotation(TaskInfo.class);
	            System.out.println("Priority: " + taskInfo.priority());
	            System.out.println("Assigned To: " + taskInfo.assignedTo());
	     }
	    }
	    }


