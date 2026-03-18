package com.cmn_class;
/*
 * String Buffer : mutable
 */
public class StringBufferDemo {
public static void main(String[] args) {
	StringBuffer s1=new StringBuffer("This is Tops Technologies");
	
	System.out.println("Original String :"+s1);
	System.out.println("Original length :"+s1.length());
	
	s1.insert(0, "Hii...");
	System.out.println("Now String :"+s1);
	System.out.println("Now length :"+s1.length());
	
	s1.append("Surat");
	System.out.println("Now String :"+s1);
	System.out.println("Now length :"+s1.length());
	
	s1.delete(0, 6);
	System.out.println("Now String :"+s1);
	System.out.println("Now length :"+s1.length());
	
	s1.reverse();
	System.out.println("Now String :"+s1.reverse());
	System.out.println("Now length :"+s1.length());
	
	s1.replace(0, 4, "Which");
	System.out.println("Now String :"+s1);
	System.out.println("Now length :"+s1.length());
}
}
