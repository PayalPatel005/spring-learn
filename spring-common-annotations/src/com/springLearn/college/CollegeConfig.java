package com.springLearn.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean
	public Teacher mathTeacherBean() {
		return new MathTeacher();
	}
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	} 
	
	//@Bean(name = {"colBean", "colBean2"})  // override default bean id // you can give multiple name
	
	@Bean
	public College collegeBean() {  // bean id = collegeBean
		College clg = new College();
		clg.setPrincipal(principalBean());
		clg.setTeacher(mathTeacherBean());
		return clg;
	}
}
