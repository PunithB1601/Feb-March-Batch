package com.dcl;

public class Diesel implements Engine {

	public Diesel() {
		System.out.println("Diesel con");
	}
	
	@Override
	public void start() {
		System.out.println("Diesel engine started");
	}

}
