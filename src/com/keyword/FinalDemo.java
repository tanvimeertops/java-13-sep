package com.keyword;
/*
 *  Final : constant at value side
 *  variable :final variable value cannot be change in run
 *  time as well as in compile time
 *  must define value as declaration
 */

class FDemo
{
	final String app_name="tops";
	public final void show() {
		System.out.println("this is final method");
	}
	public void sum(final int a,int b) {
		a=11;
		b=21;
	}
}

class  Demo extends FDemo{
	
}
public class FinalDemo {
public static void main(String[] args) {
	FDemo fd=new FDemo();
	fd.sum(10, 20);
}
}
