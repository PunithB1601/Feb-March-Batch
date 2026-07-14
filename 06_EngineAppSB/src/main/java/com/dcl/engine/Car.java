package com.dcl.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine eng;
	
	public Car() {
		System.out.println("0-param");
	}
	
	public Car(Engine eng) {
		this.eng=eng;
		System.out.println("param-con");
	}
	
	public void setEng(Engine eng) {
		this.eng=eng;
		System.out.println("setter called");
	}
	
	public void revv() {
		eng.start();
		System.out.println("Car started");
	}
}
