package com.springLearn.jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class JdbcConnection {
	
	@Value("${mysql.username}")
	private String username;
	
	@Value("${mysql.password}")
	private String password;
	
	@Value("${mysql.url}")
	private String url;
	
	@Value("${mysql.driver}")
	private String driver;
	
	public void getJdbcConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successful : "+ con);
	}
	
	public void displayInfo() {
		System.out.println("Data for DB connection : " +username+" "+password+" "+url+" "+driver);
	} 
}
