package com.assignment.task3;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int sum=0, num = 1;
    int n= 10;
		
		for(int count=1; count<=n; ){
		    //if num is even then increment 'count'
		    if(num%2 == 0){
		        sum += num;
		        count++;
		    }
		    num++;
		}
		
		System.out.println("Sum: "+sum);

	}

}
