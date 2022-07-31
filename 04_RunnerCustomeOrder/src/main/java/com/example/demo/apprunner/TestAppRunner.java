package com.example.demo.apprunner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class TestAppRunner implements ApplicationRunner, Ordered {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("-- Test Application Runner --");
		
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}
}
