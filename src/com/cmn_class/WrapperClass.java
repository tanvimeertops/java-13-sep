package com.cmn_class;

import java.util.stream.Stream;

/*
 * convert non primitive type to primitive and vice a versa
 * int  	nextInt()
 * long		nextLong()
 * double 	nextDouble()
 * char 	next.charAt(0)
 * 
 * string 
 * word		next
 * line 	nextLine()
 * 
 * autoboxing :direct value given to object
 * boxing : value first given to variable to object
 * unboxing :object to variable
 * Object class:root class for java class
 */
class Demo123{
	int v1;
	public void show() {
		System.out.println("In Demo 123");
	}
}
public class WrapperClass {
public static void main(String[] args) {
	String str=new String("Hello World");
	System.out.println("Auto boxing is: "+str);
	
	Integer i1=152;
	
	int a1=i1;
	Integer i2=new Integer(a1);
	
	System.out.println("boxing is "+i2);
	
	int a2=i1;
	System.out.println("Unboxing is "+a2);
	
	String s1="12c";
	String s2="19";
	
	int num1=Integer.parseInt(s1);
	int num2=Integer.parseInt(s2);
	System.out.println(num1+num2);
	
	String str2=String.valueOf(num1);
	System.out.println("str 2 is "+str2);
	
	Demo123 d123=new Demo123();
	d123.show();
	d123.v1=12;
	System.out.println(Integer.valueOf(d123.v1).equals(12)); 
	
}
}
