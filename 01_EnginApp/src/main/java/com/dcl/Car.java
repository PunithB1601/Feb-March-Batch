package com.dcl;

public class Car {

	private Engine eng;
	
	public Car() {
		System.out.println("0-param Car con");
	}
	
	public Car(Engine eng) {
		this.eng=eng;
		System.out.println("param Car cons");
	}
	
	public void setEng(Engine eng) {
		this.eng=eng;
		System.out.println("setter() called");
	}
	
	void revv() {
		eng.start();
		System.out.println("Car moving");
	}
}
