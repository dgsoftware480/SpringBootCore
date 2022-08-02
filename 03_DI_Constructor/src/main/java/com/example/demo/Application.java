package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.MessageService;

@SpringBootApplication
public class Application {
	
	@Autowired
	@Qualifier("TwitterService")
	private MessageService ms;

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		MessageService bean = applicationContext.getBean(MessageService.class);
		System.out.println(bean.getClass());
	}

}
