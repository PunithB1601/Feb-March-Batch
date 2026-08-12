package com.dcl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender jms;
	
	public void sendMail(String username,String receiver) {
		SimpleMailMessage message=new SimpleMailMessage();
		message.setTo(receiver);
		message.setSubject("User Account Creation");
		message.setText("Hey "+username+", The account has been created successfully!");
		jms.send(message);
		System.out.println("Mail Sent!");
		
	}
	
}
