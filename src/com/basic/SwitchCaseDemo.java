package com.basic;

public class SwitchCaseDemo {
public static void main(String[] args) {
	int choice=2;
	
	switch (choice) {
	case 1:
		System.out.println("Light is On");
		break;
	case 2:
		System.out.println("Fan is On");
		break;
	case 3:
		System.out.println("AC is On");
		break;
	case 4:
		System.out.println("PC is On");
		break;
	default:
		System.out.println("invalid input");
		break;
	}
	
	//vowel & consonant
	char ch='P';
	switch (ch) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
		System.out.println("VOWEL");
		break;

	default:
		System.out.println("CONSONANT");
		break;
	}
}
}
