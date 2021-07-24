package com.springLearn.beanlifecycle.annotation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentDAO {
	private String driver;
	private String url;
	private String username;
	private String password;
	
	Connection con;

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@PostConstruct
	public void init() throws ClassNotFoundException, SQLException {
		createStudentDBConnection();
	}
	
	public void createStudentDBConnection() throws ClassNotFoundException, SQLException {
		// first load driver
		Class.forName(driver);

		// get connection
		con = DriverManager.getConnection(url, username, password);
	}

	public void selectAllRows() throws ClassNotFoundException, SQLException {
		
		// execute query
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM assignment.student");

		while (rs.next()) {
			int sid = rs.getInt(1);
			String fname = rs.getString(2);
			String lname = rs.getString(3);
			int age = rs.getInt(4);
			System.out.println(sid + " " + fname + " " + lname + " " + age);
		}
	}

	public void deleteStudentRecord(int sid) throws ClassNotFoundException, SQLException {
		
		// execute query
		Statement stmt = con.createStatement();
		stmt.executeUpdate("DELETE FROM assignment.student where sid=" + sid);
		System.out.println("Record deleted for id no.:" + sid);
	}
	
	@PreDestroy
	public void closeDBConnection() throws SQLException {
		con.close();
	}
}
