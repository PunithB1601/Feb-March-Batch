package com.dcl.engine;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Engine{

	public Petrol() {
		System.out.println("Petrol con");
	}
	
	@Override
	public void start() {
		System.out.println("Petrol eng started");
	}

	
}
