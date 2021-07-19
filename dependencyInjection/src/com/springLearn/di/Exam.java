package com.springLearn.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student stu = context.getBean("student", Student.class);
		stu.displayInfo();
		
		Student stu2 = context.getBean("student2", Student.class);
		stu2.displayInfo();
	}
}
