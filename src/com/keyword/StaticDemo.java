package com.keyword;

/*
 * Static :constant at value side
 * variable
 * method:
 * static can have static variable only
 * static method can be called without object
 * all variable are static by default
 */
class SDemo{
	int i_no;
	static int s_no;
	
	public static void show() {
//		/i_no=12;
		s_no=45;
		int r_no=12;
		System.out.println("s no is "+s_no);
		System.out.println("r_no no is "+r_no);
	}
}
public class StaticDemo {
public static void main(String[] args) {
	SDemo s1=new SDemo();
	SDemo s2=new SDemo();
	SDemo s3=new SDemo();
	
	s1.i_no=10; //4
	s2.i_no=20; //4
	s3.i_no=30; //4 
	
	System.out.println("s1 i no is:"+s1.i_no);
	System.out.println("s2 i no is:"+s2.i_no);
	System.out.println("s3 i no is:"+s3.i_no);
	
	SDemo.s_no=1;
	SDemo.s_no=2;//4 byte
	SDemo.s_no=3;
	
	System.out.println(" s1 s_no is :"+SDemo.s_no);
	System.out.println(" s2 s_no is :"+SDemo.s_no);
	System.out.println(" s3 s_no is :"+SDemo.s_no);
	
	SDemo.show();
	
}
}
