package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NotifyCommandRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-- Notify Command Line Runner --");
		
	}

}
