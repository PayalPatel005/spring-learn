package com.springLearn.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College clg = context.getBean("collegeBean", College.class);	
		clg.test();
		context.close();
	}
}
