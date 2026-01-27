package com.annotations.rolebasedaccess;

public class AdminService {

	    @RoleAllowed("admin")
	    public void deleteUser() {
	        System.out.println("User deleted ");
	    }
	    @RoleAllowed("ADMIN")
	    public void viewAllUsers() {
	        System.out.println("Displaying all users");
	    }
	    public void publicInfo() {
	        System.out.println("Public information accessible");
	    }
	}


