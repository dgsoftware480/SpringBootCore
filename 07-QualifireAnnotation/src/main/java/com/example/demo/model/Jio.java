package com.example.demo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class Jio implements Operator{

	
	
	public Jio() {
		System.out.println(" Jio Object Created ");
	}

	@Override
	public void callService() {
		System.out.println("--Jio Call Service --");
		
	}

	@Override
	public void dataService() {
		System.out.println("-- JIo Data Service --");
		
	}

}
