package com.assignment.task6;

import java.util.*;

public class Triangle {
	int side1 = 10;
	int side2 = 5;
	int side3 = 9;
	
	public Triangle() {
		super();
		
	}
	
	int Perimeter_Calculator (int a, int b, int c)

	{ int perimeter = a + b + c; return perimeter;

	}

	int Area_Calculator (int l, int h)

	{

	int Area = l * h; return Area;

	}
	
	public static void main(String[] args) 
	{
		double Perimeter, s, Area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n Enter the Three sides of triangle: ");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();

		Perimeter = side1 + side2 + side3;
		s = Perimeter/2; 
		Area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));


		System.out.format("\n The Perimeter of the Triangle = %.2f\n", Perimeter);
		System.out.format("\n The Semi Perimeter of Triangle = %.2f\n",s);
		System.out.format("\n The Area of the triangle = %.2f\n",Area);
	}

	

}
