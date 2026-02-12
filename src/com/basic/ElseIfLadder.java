package com.basic;
/*
 * logical operator :
 * &&
 * ||
 * !
 */
public class ElseIfLadder {
public static void main(String[] args) {
	int a=450,b=90,c=20;
	if(a>b && a>c) {
		System.out.println("a is greater");
	}else if (b>a&&b>c) {
		System.out.println("b is greater");
	}else {
		System.out.println("c is greater");
	}
	
	//grade :
	double average=15;
	if(average>=70) {
		System.out.println("distinction");
	}else if (average>=60) {
		System.out.println("first class");
	}else if (average>=50) {
		System.out.println("second class");
	}else if (average>=35) {
		System.out.println("third class");
	}else {
		System.out.println("fail");
	}
	
	//vowel & consonant
	char ch='E';
	if (ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'||ch=='A') {
		System.out.println("vowel");
	}else {
		System.out.println("consonant");
	}
}
}
