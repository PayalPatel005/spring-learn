package com.springLearn.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	private Heart heart;
	
	public Human() {} // default constructor is imp for autowired
		
	public Human(Heart heart) {
		this.heart = heart;
	}

	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method off heart is called");
	}
	
	public void startPumping() {
		if(heart != null) {
			heart.pump();
			System.out.println("Name of animal : " + heart.getNameOfAnimal() + "\nNumber of heart : " + heart.getNoOfHeart());
		} else
			System.out.println("You are dead");
	}
}
