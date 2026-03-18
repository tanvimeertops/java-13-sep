package com.cmn_class;
/*
 * String is immutable
 */
public class StringDemo {
public static void main(String[] args) {
	String str="This is Tops Technologies...";
	
	System.out.println("Original String :"+str);
	System.out.println("Original length :"+str.length());
	System.out.println("to lower case :"+str.toLowerCase());
	System.out.println("to upper case :"+str.toUpperCase());
	System.out.println("substring is :"+str.substring(2));
	System.out.println("substring is :"+str.substring(2,12));
	
	if(str.equalsIgnoreCase("this is Tops Technologies...")) {
		System.out.println("both are same");
	}else {
		System.out.println("both are different");
	}
	
	System.out.println("Original String :"+str);
	System.out.println("Original length :"+str.length());
}
}
