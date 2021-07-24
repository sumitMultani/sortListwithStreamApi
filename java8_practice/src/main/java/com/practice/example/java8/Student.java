package com.practice.example.java8;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int rollNo;
	private String name;
	private String subject;
	private int marks;

	public Student() {
	}

	public Student(int rollNo, String name, String subject, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public static List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student(1, "karan", "Java", 80);
		Student student2 = new Student(23, "Vicky", "C", 70);
		Student student3 = new Student(39, "Mohit", "C++", 75);
		Student student4 = new Student(14, "Vivek", "Java", 60);
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		return studentList;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject=" + subject + ", marks=" + marks + "]";
	}
	
	
}
