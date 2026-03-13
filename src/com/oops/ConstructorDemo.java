package com.oops;
/*
 * constructor : special function which is invoked 
 * automatically whenever object is created
 * 
 * 1. same name as class name
 * 2. no return type
 * 3. invoked automatically whenever object is created
 * 
 */

class Volume{
	double width,height,depth;
	
	public Volume() {
		System.out.println("in default constructor");
		width=1;
		height=2;
		depth=3;
	}
	public Volume(double w,double h,double d) {
		System.out.println("in parameter constructor");
		width=w;
		height=h;
		depth=d;
	}
	//copy constructer (objet pass as a paramter)
	public Volume(Volume d) {
		System.out.println("in copy constructor");
		width=d.width;
		height=d.height;
		depth=d.depth;
	}
	public void volOfBox() {
		System.out.println("volume of box is :"+width*height*depth);
	}
}
public class ConstructorDemo {
public static void main(String[] args) {
	Volume dc=new Volume();
	dc.volOfBox();
	Volume pc=new Volume(10, 20, 30);
	pc.volOfBox();
	
	Volume cc =new Volume(pc);
	cc.volOfBox();
}
}
