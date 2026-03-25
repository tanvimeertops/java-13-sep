package com.exception;

import java.util.Scanner;

/*
 * ATM :withdrAW
 * balance>amount 
 * 5000>2000
 * balance<amount
 * 5000<15000
 * if you deposit 10000 more you can withdraw 15000
 * 
 * ATM :
 * deposit(amount)
 * withdraw(amount)
 * 	if balance>amount:
 * 		balance-amount=remaining bal
 * 	else
 * 		amount-balance=required amount
 * 
 * Exception class must be inherited
 * needs required amount
 * 
 * handle exceptiion
 */

class TanviException extends Exception{
	double amount;
	public TanviException(double amount) {
		this.amount=amount;
	}
}
class ATM {
	double balance=1000;
	public void deposit(double amount) {
		balance+=amount;
		System.out.println(amount+"rs deposited your total balance is "+balance);
	}
	
	public void withdraw(double amount) throws TanviException {
		if(balance>amount) {
			balance-=amount;
			System.out.println(amount+"rs withdraw your total balance is "+balance);
		}else {
			double needs=amount-balance;
			throw new TanviException(needs);
		}
	}
	
}
public class UserDefinedException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double amount;
	ATM atm=new ATM();
	System.out.println("Enter the amount to be deposited :");
	amount=sc.nextDouble();
	atm.deposit(amount);
	System.out.println("Enter the amount to be withdrawn :");
	amount=sc.nextDouble();
	try {
		atm.withdraw(amount);
	} catch (TanviException e) {
		System.out.println("if you deposit "+e.amount+" more you can withdraw "+amount); 
	}
}
}
