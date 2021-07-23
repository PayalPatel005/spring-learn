package com.springLearn.college;

public class College {
	
	private Principal principal;
	
	private Teacher teacher;
	
	/*public College(Principal principal) {
		this.principal = principal;
	}*/

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}

	public void test() {
		principal.displayInfo();
		teacher.teach();
		System.out.println("Testing");
	}
}
