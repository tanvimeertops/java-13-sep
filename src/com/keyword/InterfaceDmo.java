package com.keyword;

/*
 * Interface:
 * same as class but cannot create object of interface
 * all variable are final by default
 * all methods are abstract by default
 * main purpose is to obtain multiple inheritance
 * use implements keyword to inherit interface
 * pure data hiding
 * class-->class =extends
 * interface-->child =implements
 * interface-->interface=extends
 */

class Result {
	String grade="A+";
}
class IDemo extends Result implements InterDemo,InterDemo2{

	@Override
	public void show() {
	System.out.println(" i no is :"+i_no);
		System.out.println("grade is :"+grade);
		System.out.println(" i no 1: "+i_no1);
	}
	
}
public class InterfaceDmo {
public static void main(String[] args) {
	IDemo id=new IDemo();
	id.show();
}
}
