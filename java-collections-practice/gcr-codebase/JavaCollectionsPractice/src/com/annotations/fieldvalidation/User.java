package com.annotations.fieldvalidation;
	import java.lang.reflect.Field;
	class User { 
	    @MaxLength(10)
	    private String username;
	    public User(String username) {
	        this.username=username;
	        validateMaxLength();
	    }

	    private void validateMaxLength() {

	        Field[] fields=this.getClass().getDeclaredFields();
	        for (int i=0; i<fields.length; i++) {

	            Field field=fields[i];
	            if (field.isAnnotationPresent(MaxLength.class)) {
	                MaxLength maxLength=field.getAnnotation(MaxLength.class); 
	                field.setAccessible(true);

	                try {
	                    Object value=field.get(this);
	                    if (value instanceof String) {
	                        String str=(String) value;
	                        if (str != null && str.length()>maxLength.value()) {
	                            throw new IllegalArgumentException(
	                                field.getName() + maxLength.value());
	                        }
	                    }

	                }
	                catch (IllegalAccessException e) {
	                    throw new RuntimeException(e);
	                }
	            }
	        }
	    }
	}

