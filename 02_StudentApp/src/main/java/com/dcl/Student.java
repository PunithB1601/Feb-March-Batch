package com.dcl;

public class Student {

	private College college;
	
	public Student() {
		System.out.println("0-param");
	}
	
	public Student(College college) {
		this.college=college;
		System.out.println("PARAM");
	}
	
	public void setCollege(College college) {
		this.college=college;
		System.out.println("setter() called");
	}
	
	void study() {
		college.teach();
		System.out.println("Student graduated");
	}
}
