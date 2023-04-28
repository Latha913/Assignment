package com.assignment.task2;

import java.util.Scanner;

import com.assignment.task2.calculator.Add;
import com.assignment.task2.calculator.Divide;
import com.assignment.task2.calculator.Multiply;
import com.assignment.task2.calculator.Subtract;

public class ElectricityBill {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		System.out.println("Enter Electricity Unit: ");
		int opr = sc.nextInt();
		
		if(opr <= 60) {
			temp = opr*.30;
			}else if(opr <=150 && opr >= 60){
				temp =opr*.75;
			}else if(opr <=270 && opr >= 150){
				temp = opr*1.10;
			}else {
				temp = opr*2.50;
			}
		double totalbill = temp+temp*.20;
		System.out.println("Total Electricity bill is : "+totalbill);
		
		}

}
