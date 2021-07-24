package com.springLearn.beanlifecycle.annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO dao = context.getBean("studentDAO", StudentDAO.class);
		dao.selectAllRows();
		context.close();
		context.registerShutdownHook(); // same as close method but it'll execute only 
		// once when the main thread ends. Irrespective of the line number we're calling it
	}
}
