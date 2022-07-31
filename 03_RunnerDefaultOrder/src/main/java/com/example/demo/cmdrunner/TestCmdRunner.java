package com.example.demo.cmdrunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestCmdRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-- Test Commad Line Runner --");
		
	}

}
