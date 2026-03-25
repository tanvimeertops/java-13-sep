package com.exception;

/*
 * Exception : abnormal condition
 * compile time: missing ; }
 * runtime error
 * 
 * try
 * catch
 * finally
 * throw  
 * throws
 */
public class ExceptionDemo {
	public static void main(String[] args) {
		int no1 = 10, no2 = 0;
		System.out.println("div is " + (float) no1 / no2);
		int[] a = new int[3];
		try {
			for (int i = 0; i < 5; i++) {
				a[i] = i + 1; // a[0]=1 a[1]=2 a[2]=3 a[3]=4
			}
			for (int i = 0; i < 5; i++) {
				System.out.println(a[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("This code is wriiten by tanvi");
			System.out.println("software version 20.5");
		}

	}
}
