package com.assignment.task2;

public class GradeCheck {
	public static void main(String[] args) {
		int percentage = 91;
		
		if(percentage > 90) {
			System.out.println("Grade is A");
		}else if(percentage > 75 && percentage <= 90) {
			System.out.println("Grade is B");
		}else if(percentage > 60 && percentage <= 75) {
			System.out.println("Grade is c");
		}else {
			System.out.println("Grade is D");
			
		}
		
	}
}
