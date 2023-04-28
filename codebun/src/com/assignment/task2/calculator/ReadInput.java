package com.assignment.task2.calculator;

import java.util.Scanner;

public class ReadInput {
	public static String read() {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Input Charachers: ");
	
	String inputline = scanner.nextLine();
	
	scanner.close();
	return inputline;
	
	}
	

}
