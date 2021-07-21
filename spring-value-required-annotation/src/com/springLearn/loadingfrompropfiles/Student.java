package com.springLearn.loadingfrompropfiles;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	private String name;
	private String course;
	private String hobby;
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Value("${student.course}")
	public void setCourse(String course) {
		this.course = course;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student name : "+ name);
		System.out.println("Course : "+ course);
		System.out.println("Hobby : " + hobby);
	}
}
