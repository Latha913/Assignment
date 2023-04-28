package com.assignment.task2;

public class BreakAndContinue {
	public static void main(String[] args)   
	{  
		int[] num = {7,-1, 8};
		for(int i : num) {
		if(i < 0) {
			System.out.println("Its Over");
			break;
		}else {
			System.out.println("Good Going");
			continue;
			}
		}
	}

}
