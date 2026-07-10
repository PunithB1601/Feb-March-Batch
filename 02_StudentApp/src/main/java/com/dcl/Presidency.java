package com.dcl;

public class Presidency implements College {

	public Presidency() {
		System.out.println("Preseidency con");
	}
	
	@Override
	public void teach() {
		System.out.println("Student is studying in Preseidency");
	}

}
