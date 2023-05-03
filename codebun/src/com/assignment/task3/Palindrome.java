package com.assignment.task3;

public class Palindrome {
	public static void main(String[] args) {
		String key = "tacocat";
		
		String newKey="";
		
			for(int j = key.length()-1; j>= 0;j--) {
				newKey = newKey+key.charAt(j);
			}
		if(key.equals(newKey)) {
			  System.out.println("Entered string is a palindrome."); 
		}
		      else  {
		         System.out.println("Entered string isn't a palindrome.");
		      }
		
	}

}
