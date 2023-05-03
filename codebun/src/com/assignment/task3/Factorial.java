package com.assignment.task3;

public class Factorial {
	
	public static void main(String args[]){  
		int f = 1;  
	      int j = 1;  
	      int number = 5;
	      while(j <= number) {  
	         f = f * j;  
	         j++;  
	      }  
	      
	      System.out.println("Factorial of "+number+" is: "+f); 
	}

}
