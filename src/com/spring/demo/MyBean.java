package com.spring.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBean implements BeanNameAware,BeanFactoryAware,
ApplicationContextAware,InitializingBean,DisposableBean{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setBeanName(String beanName) {
		System.out.println("Bean name is: "+beanName);
		System.out.println("value of i: "+i);
	}
	public void setBeanFactory(BeanFactory beanFactory){
		System.out.println("In bean factory method");
		
		Student student = (Student) beanFactory.getBean("student2");
		student.showSubjectMarks();
		System.out.println("value of i: "+i);
	}
	
	public void setApplicationContext(ApplicationContext context){
		System.out.println("In Application context method");
		Student student = (Student) context.getBean("student2");
		student.showEmail();
		System.out.println("value of i: "+i);
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("In After property set method");
		System.out.println("value of i: "+i);
	}
	
	public void myInit(){
		
		System.out.println("In custom init method");
	
	}

	public void destroy() throws Exception {
		System.out.println("IN Destroy method()");
		
	}
	
	public void myDestroy(){
		System.out.println("My Destroy method called");
	}
	
}
