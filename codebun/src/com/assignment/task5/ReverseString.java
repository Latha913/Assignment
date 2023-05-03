package com.assignment.task5;

public class ReverseString {
	public static void main(String[] args)
    {
        String input = "consultadd pvt";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
        input1.reverse();
 
        // print reversed String
        System.out.println(input1);
    }

}
