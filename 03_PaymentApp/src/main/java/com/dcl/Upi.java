package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Upi implements Payment {

	public Upi() {
		System.out.println("UPI con");
	}
	
	@Override
	public void doPayment() {
		System.out.println("Payment done by using UPI");
	}

}
