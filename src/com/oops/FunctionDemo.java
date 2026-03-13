package com.oops;
/*
 * Function : does something
 * function without parameter without return type
 * function with parameter without return type
 * function without parameter with return type
 * function with parameter with return type
 * 
 * polymorphism : one name diff forms
 * function overloading: same funct name but diff parameter
 * function overiding : same name same parameter
 */

class Calc{
	
	//function without parameter without return type
	public void sum() {
		int a=10,b=34;
		System.out.println("sum is "+(a+b));
	}
	//function with parameter without return type
	public void sum(int a,int b) {
		
		System.out.println("sum is "+(a+b));
	}
	
	//function without parameter with return type
	public double div() {
		int a=10,b=4;
		return (double)a/b;
	}
	//function with parameter with return type
	public double div(double a,double b) {
		return (double)a/b;
	}
}
public class FunctionDemo {
public static void main(String[] args) {
	Calc c1=new Calc();
	c1.sum();
	c1.sum(14,85);
	System.out.println("div is "+c1.div());
	System.out.println("div is "+c1.div(74.5,4))
	
	
	
	;
}
}
