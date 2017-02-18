package com.spring.demo;
public class B {
	A a;
	String message;
	public B(){}
	public B(A a,String message){
		System.out.println("In contructor of B");
		this.a = a;
		this.message = message;
	}
	
	
	
	
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void showA(){
		a.show();
	}
	
	public void showMessage(){
		System.out.println("Message: "+message);
	}
}
