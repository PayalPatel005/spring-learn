package com.springLearn.jdbcConnection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mysql {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Beans.xml file loaded");
		JdbcConnection con = context.getBean("JdbcConnection", JdbcConnection.class);
		con.displayInfo();
		con.getJdbcConnection();
	}
}
