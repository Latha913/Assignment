package com.assignment.task1;

public class SwapNumbersWithOutTemp {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
	
		System.out.println("before swapping numbers: "+a +" "+ b);  
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swapping: "+a +"  " + b);
		
	}

}
