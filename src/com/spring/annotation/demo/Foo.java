package com.spring.annotation.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Foo {
	private Bar bar;
	@Autowired
	public Foo(Bar bar){
		System.out.println("In Contructor injecttion");
		this.bar = bar;
	}
	
	public void showA(){
		bar.show();
	}
}
