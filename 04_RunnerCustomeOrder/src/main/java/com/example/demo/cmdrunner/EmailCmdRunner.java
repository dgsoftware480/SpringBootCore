package com.example.demo.cmdrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class EmailCmdRunner implements CommandLineRunner, Ordered{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-- Email Commad Line Runner --");
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 3;
	}

}
