package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("--Before run--");
		
		SpringApplication.run(Application.class, args);
		
		System.out.println("--After run--");
	}

}
