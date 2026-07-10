package com.dcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Bill b=context.getBean(Bill.class);
		b.generateBill();
		//	System.out.println("Program terminated");
	}
}
