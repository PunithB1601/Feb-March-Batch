package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dc")

public class DebitCard implements Payment{

	public DebitCard() {
		System.out.println("DebitCard con");
	}
	
	@Override
	public void doPayment() {
		System.out.println("Payment done by using DC");
	}

}
