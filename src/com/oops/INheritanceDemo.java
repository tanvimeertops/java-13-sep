package com.oops;
/*
 * Inheritance: deriving attribute of some other class
 * single : one parent one child
 * multilevel : one grandparent one parent one child
 * multiple :mutiple parent one child (not supported)
 * hierarchical: single parent multiple child
 * hybird :comb of any two
 * 
 * object will be made for last child only
 * encapsulation:wrapping of data
 * access specifier
 * private :access within class
 * protected :access in child class also
 * default :access within package
 * public :access everywhere
 */
class Student123 {
	private int id;
	protected String name;
	
	public void setData() {
		id=123;
		name="tops";
	}
	
}
class  Sports extends Student123{
	 int sport_marks=45;
	
	
}
class Result extends Sports{
	String grade="A+";
	public void show() {
//		System.out.println("id is :"+id);
		System.out.println("name is :"+name);
		System.out.println("marks is :"+sport_marks);
		System.out.println("grade is :"+grade);
	}
}
public class INheritanceDemo {
public static void main(String[] args) {
	Result rs=new Result();
	rs.setData();
	rs.show();
}
}
