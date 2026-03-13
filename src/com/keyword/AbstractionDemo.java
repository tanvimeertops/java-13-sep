package com.keyword;
/*
 *Abstraction : hiding details showing only essential
 *information
 *class : 
 *	cannot make object 
 *	must inherit into child class
 *method:
 *	cannot have body
 *	must implement into child class
 *
 */

abstract class ADemo{
	
	public abstract void display();
}
class Demo extends ADemo{

	@Override
	public void display() {
		System.out.println("This is abstraction demo");
		
	}
	
}
public class AbstractionDemo {
public static void main(String[] args) {
//	ADemo ad=new ADemo();
	Demo d1=new Demo();
	d1.display();
}
}
