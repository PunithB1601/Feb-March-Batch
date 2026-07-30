package com.dcl.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.dcl.entity.Product;
import com.dcl.service.ProductService;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private ProductService pservice;
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p1=new Product();
		p1.setName("Watch");
		p1.setPrice(10000.0);
		p1.setBrand("Titan");
		p1=pservice.addProduct(p1);
		System.out.println(p1);
	}

}
