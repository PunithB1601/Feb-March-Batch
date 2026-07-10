package com.dcl;

public class Petrol implements Engine {

	public Petrol() {
		System.out.println("Petrol con");
	}
	
	@Override
	public void start() {
		System.out.println("Petrol engine started");
	}

}
