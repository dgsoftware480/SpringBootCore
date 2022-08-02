package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.MessageService;

@Service("SMSService")
public class SMSService implements MessageService{
    public void sendMsg() {
         System.out.println("SMSService");
    }
}
