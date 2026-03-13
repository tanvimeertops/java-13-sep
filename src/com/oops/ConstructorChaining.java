package com.oops;
/*
 * Polymorpshim : function overriding
 *  super keyword :calls the function of immediate parent
 */
class A{
	public A() {
		System.out.println("In class A constructor");
	}
	public void show() {
		System.out.println("In A show");
	}
}
class B extends A{
	public B() {
		System.out.println("In class B constructor");
	}
	public void show() {
		super.show();
		System.out.println("In B show");
	}
}
class C extends B{
	public C() {
		System.out.println("In class C constructor");
	}
	public void show() {
		super.show();
		System.out.println("In C show");
	}
}
public class ConstructorChaining {
public static void main(String[] args) {
	C c=new C();
	c.show();
	
}
}
