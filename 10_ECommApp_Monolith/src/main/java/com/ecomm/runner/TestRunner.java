package com.ecomm.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ecomm.entity.User;
import com.ecomm.repository.UserRepository;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private UserRepository urepo;
	
	@Override
	public void run(String... args) throws Exception {
		User u1=urepo.findById(3).orElse(null);
		u1.setPassword("ani");
		urepo.save(u1);
	}

}
