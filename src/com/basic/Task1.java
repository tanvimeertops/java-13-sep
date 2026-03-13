package com.basic;
/*
 * .If a five-digit number 12345, write a
program to reverse the number.


 */
public class Task1 {
public static void main(String[] args) {
	int num=12345,rem,rev=0;
	System.out.println("Actual number "+num);
	while (num!=0) { 
		rem=num%10;//1
		num=num/10; //0
		rev=rev*10+rem; //54321
	}
	System.out.println("revrse no is :"+rev);
	
	
	
}
}
