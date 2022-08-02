package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.MessageService;

@Service("TwitterService")
public class TwitterService implements MessageService{
    public void sendMsg() {
        System.out.println("TwitterService");
    }
}
