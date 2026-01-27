package com.annotations.customannotations;


	class TaskManager {

	    @TaskInfo(priority=1,assignedTo="Suyash")
	    public void completeTask(){
	        System.out.println("Task completed");
	    }
	}



