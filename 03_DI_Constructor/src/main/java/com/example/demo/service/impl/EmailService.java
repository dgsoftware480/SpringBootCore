package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.MessageService;

@Service("EmailService")
public class EmailService implements MessageService{
	
	
	
    public EmailService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void sendMsg() {
        System.out.println("EmailService");
    }

}
