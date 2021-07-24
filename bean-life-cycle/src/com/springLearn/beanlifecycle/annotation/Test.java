package com.springLearn.beanlifecycle.annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		StudentDAO dao = context.getBean("studentDAO", StudentDAO.class);
		dao.selectAllRows();
		((ClassPathXmlApplicationContext)context).close();
	}
}
