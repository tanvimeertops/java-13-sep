package com.basic;
/*
 * 
 */
public class NestedIfDemo {
public static void main(String[] args) {
	int a=45,b=90,c=200;
	
	if(a>b) { //45>90
		if(a>c) { 
			System.out.println("A is greater");
		}else {
	
			System.out.println("C is greater");
		}
	}else {
		if(b>c) { //90>200
			System.out.println("B is greater");
		}else {
			System.out.println("c is greater");
		}
	}
}
}
