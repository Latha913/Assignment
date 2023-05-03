package com.assignment.task6;

public class Student1 {

	 String ss;
	    String name;
	  public Student1(String ss){
	      name = ss;
	  }
	  public Student1()
	  {
	      name = "unknown";
	  }
	

	
	    public static void main(String[] args) {
	        Student1 obj = new Student1();
	        obj.ss = "Latha";
	        //Student ss1 = new Student();
	        System.out.println(obj.ss);
	        System.out.println(obj.name);

	    }
}
