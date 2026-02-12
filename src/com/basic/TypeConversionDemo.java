package com.basic;

/*
 * primitive
 * int, float, double, boolean,byte
 * 
 * non primitive
 * type conversion: covert one primitive data type into another
 * implicit (Automatic) smaller datatype to
 * bigger datatype
 * explicit :big datatype to smaller
 */
public class TypeConversionDemo {
public static void main(String[] args) {
	int i1=45;  //4
	long l1=i1; //8
	System.out.println("implicit conersion :"+l1);
	float i2=(float)l1;
	System.out.println("explicit conversion "+i2);
	int i3=513; //4
	byte b1=(byte)i3; //1  -128 -127 -126 to 127
	System.out.println("Byte is "+b1);
	char ch='A';
	System.out.println("char is "+ch);
	int num_1=ch;
	System.out.println("num 1 is"+num_1);//Ascii code
}
}
