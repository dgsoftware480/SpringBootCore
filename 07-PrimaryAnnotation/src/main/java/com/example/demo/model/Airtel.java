package com.example.demo.model;

import org.springframework.stereotype.Service;

@Service
public class Airtel implements Operator{

	
	
	public Airtel() {
		System.out.println(" Artel Object Created ");
	}

	@Override
	public void callService() {
		System.out.println("--Airtel Call Service --");
		
	}

	@Override
	public void dataService() {
		System.out.println("--Airtel Data Service --");
		
	}

}
