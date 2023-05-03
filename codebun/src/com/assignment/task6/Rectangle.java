package com.assignment.task6;

public class Rectangle {
	int length;
    int breadth;

    public Rectangle()
    { //this(10);
        int length = 0;
        int breadth = 0;

    }

    public Rectangle(int lenght)
    {//this(5,8);
        this.length = 4 ;
         breadth = 5;

    }
    public Rectangle(int length,int breadth)
    {
        this.length = 7;
        this.breadth = 8;
    }
    public void  m1()
    {
        System.out.println(length*breadth);
    }


    public static void main(String[] args) {
    	Rectangle obj = new Rectangle();
        obj.m1();
        Rectangle obj1= new Rectangle(10);
        obj1.m1();
        Rectangle obj2 = new Rectangle(12,2);
        obj2.m1();


    }

}
