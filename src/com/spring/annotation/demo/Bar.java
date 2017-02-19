package com.spring.annotation.demo;

import org.springframework.stereotype.Component;

@Component
public class Bar {
	
	public void show(){
		System.out.println("Hi! I am in show() of bean A");
	}

}
