package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Operator;

@SpringBootApplication
@RestController
public class Application {

	@Autowired
	@Qualifier("jio")
	private Operator op;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	
	@GetMapping("/call")
	public void getCall() {
		op.callService();	//--Jio Call Service --
	}
}
