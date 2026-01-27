package com.annotations.markmethods;


	import java.lang.annotation.Retention;
	import java.lang.annotation.RetentionPolicy;
	import java.lang.annotation.Target;
	import java.lang.annotation.ElementType;
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	@interface ImportantMethod {
	    String level() default "high";
	}
