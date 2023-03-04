package org.com.capegemini.model;

public class Student {

	private int roll;
	private String name;
	private String subject;
	private float marks;
	
	public Student(int roll, String name, String subject, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
	public int getRoll() {
		return roll;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public float getMarks() {
		return marks;
	}
	
	
}
