package com.dcl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("cc")
public class CreditCard implements Payment {

	public CreditCard() {
		System.out.println("CreditCard con");
	}
	@Override
	public void doPayment() {
		System.out.println("Payment done by using CC");
	}

}
