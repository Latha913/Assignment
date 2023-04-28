package com.assignment.task1;

public class SumAndArea {
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static double areaOfCircle(int r) {
		return 3.14*r*r;
		
	}
	 public static void main(String[] args) {
		 int a = 1;
			int b = 2;
			int r = 3;
		 
		 System.out.println("sum of 2 numbers is "+sum(a,b));
			System.out.println("Area of the circle is "+areaOfCircle(r));
			
	 }

}
