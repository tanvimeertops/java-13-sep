package com.basic;
/*
 * Loop : iterative ,repetitive
 * entry control :
 * for :
 * syn:
 * for (initialization;condition;incree/decree)
 * while :
 * 	initialization
 * while(condition){
 * statement
 * incree/decree;
 * }
 * 
 * exit control:
 * do while : 
 * initialization
 * do {
 * statement
 * incree/decree
 * }while(condition)
 */
public class LoopDemo {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) { //6
		System.out.println(i); //5
	}
//	11 times
	int i=1;  //1
	while (i<=5) { //6
		System.out.println(i); //5
		i++;//5
	}
//	17 times
	
////	int i=6; //1
//	do {
//		System.out.println(i);
//		i++;
//	} while (i<=5); 
//	//21 times
}
}
