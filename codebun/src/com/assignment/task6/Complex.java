package com.assignment.task6;

public class Complex {
	private float real;
    private float imag;
    
    Complex() {
        real = 0; imag = 0;
    }
    Complex(float r, float i) {
        real = r; imag = r;
    }
    
    float getReal() {
        return real;
    }
    float getImag() {
        return imag;
    }
    
    void setReal(float r) {
        real = r;
    }
    void setImag(float i) {
        imag = i;
    }
    
    public Complex add(Complex c) {
        float r = real + c.getReal();
        float i = imag + c.getImag();
    
        return new Complex(r,i);
    }
    
    public Complex mul(Complex c) {
        float r = real * c.getReal();
        float i = imag * c.getImag();
        
        return new Complex(r,i);
    }
    
    public void print() {
        System.out.printf("%.0f + i%.0f\n", real, imag);
    }
    
    public static void main(String [] args) {
        Complex c1 = new Complex(5, 10);
        Complex c2 = new Complex(4, 15);
        Complex res = new Complex();
        
        res = c1.add(c2);
        res.print();
        res = c1.mul(c2);
        res.print();
    }

}
