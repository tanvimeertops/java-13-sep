package com.oops;
/*
 * Class :class a collection data member and member function
 * Object :gives permission to access functionality of class
 */

class Student{
	int id;
	String name,degree;
	char grade;
	
	public void setData() {
		id=1;
		name="sneha";
		degree="BCA";
		grade='B';
	}
	
	public void display() {
		System.out.println("id is "+id);
		System.out.println("name is "+name);
		System.out.println("degree is "+degree);
		System.out.println("grade is "+grade);
	}
}
public class ClassDemo {
public static void main(String[] dff) {
	Student123 s1=new Student123();
	s1.setData();
	s1.display();
	
}
}
