package com.annotations.rolebasedaccess;
import java.lang.reflect.Method;
public class Main {
	    public static void main(String[] args) throws Exception {
	        AdminService service=new AdminService();
	        Class serviceClass=service.getClass();
	        UserContext.setRole("user"); 
	        Method[] methods=serviceClass.getDeclaredMethods();
	        for (int i=0;i<methods.length;i++) {

	            Method method=methods[i];

	            if (method.isAnnotationPresent(RoleAllowed.class)) {
	                RoleAllowed roleAllowed=method.getAnnotation(RoleAllowed.class);

	                if (UserContext.getRole().equals(roleAllowed.value())) {
	                    method.invoke(service);
	                }
	                else {
	                    System.out.println(method.getName());
	                }

	            }
	            else {
	                method.invoke(service);
	            }
	        }
	    }
	}

