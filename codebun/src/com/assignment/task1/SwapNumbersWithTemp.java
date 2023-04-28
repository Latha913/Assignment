package com.assignment.task1;

public class SwapNumbersWithTemp {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
	
		System.out.println("before swapping numbers: "+a +" "+ b);  
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping: "+a +"  " + b);
		
	}

}
