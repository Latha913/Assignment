package com.assignment.task6;

public class Student {
	String name;
	int EnrollmentNo;
	public Student(String name, int enrollmentNo) {
		super();
		this.name = name;
		EnrollmentNo = enrollmentNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnrollmentNo() {
		return EnrollmentNo;
	}
	public void setEnrollmentNo(int enrollmentNo) {
		EnrollmentNo = enrollmentNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", EnrollmentNo=" + EnrollmentNo + "]";
	}
	
	public static void main(String args[]) {
		Student s1 = new Student("Amy",123);
		System.out.println(s1);	}
	
	

}
