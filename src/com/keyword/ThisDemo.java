package com.keyword;
/*
 * This :current class context
 */

class TDemo{
	int num1,num2;
	public void setData(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void sum() {
		System.out.println("sum is :"+(num1+num2));//152
	}
	
	
}
public class ThisDemo {
public static void main(String[] args) {
	TDemo td=new TDemo();
	td.setData(100, 52);
	td.sum();
}
}
