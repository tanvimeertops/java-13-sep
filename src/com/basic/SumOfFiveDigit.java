package com.basic;
/*
 * 12345
 * 1+2+3+4+5
 * last digit :no%10
 * remove last digit :no/10
 */
public class SumOfFiveDigit {
public static void main(String[] args) {
	int no1=12345;
	int num1=no1%10;//5
	System.out.println("num 1:"+num1);
	int no2=no1/10;//1234
	System.out.println("no 2:"+no2);
	int num2=no2%10;//4
	System.out.println("num 2:"+num2);
	int no3=no2/10;//123
	System.out.println("no 3:"+no3);
	System.out.println(num1+num2);
}
}
