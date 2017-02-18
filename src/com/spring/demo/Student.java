package com.spring.demo;

import java.util.ArrayList;
import java.util.List;


public class Student {
	private String name;
	
	//private List<String> subjects;
	
	private ArrayList<Subject> subjects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/*public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}*/
	
	
	public void showSubjects(){
		System.out.println("All subjects: ");
		for (Subject subject : subjects) {
			System.out.println(subject);
		}
	}

	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	

}
