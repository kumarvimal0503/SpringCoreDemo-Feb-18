package com.spring.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Student {
	private String name;
	
	private ArrayList<Subject> subjects;
	
	private Set<String> emailIds;
	
	private Map<Subject, Double> subjectMarks;

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

	public Set<String> getEmailIds() {
		return emailIds;
	}

	public void setEmailIds(Set<String> emailIds) {
		this.emailIds = emailIds;
	}

	public void showEmail(){
		System.out.println("My emails: "+emailIds);
	}

	/*public Map<String, Double> getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(Map<String, Double> subjectMarks) {
		this.subjectMarks = subjectMarks;
	}*/
	
	

	/*public void showSubjectMarks(){
		for (Map.Entry<String, Double> entryObj : subjectMarks.entrySet()) {
			System.out.println("Subject Name: "+entryObj.getKey()+", Marks: "+entryObj.getValue());
		}
	}*/
	
	public void showSubjectMarks(){
		for (Map.Entry<Subject, Double> entryObj : subjectMarks.entrySet()) {
			System.out.println("Subject Name: "+entryObj.getKey().getSubjectName()+", Marks: "+entryObj.getValue());
		}
	}

	public Map<Subject, Double> getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(Map<Subject, Double> subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

}
