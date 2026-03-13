package com.oops;
class Parent{
	
	String p_name;
	long ph_name;
	
	public void setData() {
		p_name="salim khan";
		ph_name=545454152l;
	}
}

class Child_1 extends Parent{
	String name="salman";
	public void display() {
		System.out.println("For any complain of "+name+p_name +"call "+ph_name);
	
	}
}
class Child_2 extends Parent{
	String name="suhail";
	public void display() {
		System.out.println("For any complain of "+name+p_name +"call "+ph_name);
	
	}
}
public class HierarchicalInheritance {
public static void main(String[] args) {
	Child_1 ch1=new Child_1();
	Child_2 ch2=new Child_2();
	
	ch1.setData();
	ch1.display();
	
	ch2.setData();
	ch2.display();
}
}
