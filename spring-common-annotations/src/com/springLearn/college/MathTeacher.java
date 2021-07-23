package com.springLearn.college;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Your math teacher is here. I'll teach matrix today.");
	}

}
