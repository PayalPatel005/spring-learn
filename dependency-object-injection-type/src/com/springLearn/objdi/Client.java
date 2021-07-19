package com.springLearn.objdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans loaded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();
		
		AnotherStudent as = context.getBean("anotherStu", AnotherStudent.class);
		as.startCheating();
	}
}
