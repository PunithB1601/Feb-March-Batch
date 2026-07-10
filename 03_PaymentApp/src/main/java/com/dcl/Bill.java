package com.dcl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bill {

	private Payment payment;
	
	public Bill() {
		System.out.println("0-PARAM");
	}

	@Autowired
	public Bill(Payment payment) {
		this.payment = payment;
		System.out.println("PARAM");
	}
	
	
	public void setPayment(Payment payment) {
		this.payment=payment;
		System.out.println("setter() called");
	}

	void generateBill() {
		payment.doPayment();
		System.out.println("Bill Generated");
	}
}
