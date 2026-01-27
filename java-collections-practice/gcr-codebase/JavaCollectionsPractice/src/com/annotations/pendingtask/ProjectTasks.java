package com.annotations.pendingtask;
	class ProjectTasks {
	    @Todo(
	        task="Implement user authentication",
	        assignedTo="Suyash",
	        priority="high"
	    )
	    public void loginFeature() {
	    }

	    @Todo(
	        task="Add password reset functionality",
	        assignedTo="jay"
	    )
	    public void passwordResetFeature() {
	    }
	    @Todo(
	        task="Optimize database queries",
	        assignedTo="raj",
	        priority="low"
	    )
	    public void optimizeDatabase() {
	    }
	}


