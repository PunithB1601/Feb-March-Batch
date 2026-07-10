package com.dcl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		//To start IoC container
		//Petrol p=context.getBean(Petrol.class);
		Car c=context.getBean(Car.class);
		c.revv();
		
	}
}
