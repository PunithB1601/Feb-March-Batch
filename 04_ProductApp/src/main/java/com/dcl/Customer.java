package com.dcl;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Customer{

	//init
	@PostConstruct
	public void accountCreation() {
		System.out.println("Customer acc created");
	}
	
	public void purchaseProduct() {
		System.out.println("Product purchased");
	}
	
	//destroy
	@PreDestroy
	public void deleteAccount() {
		System.out.println("Account deleted");
	}

	

	
}

