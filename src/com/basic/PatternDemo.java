package com.basic;
/*
 * 
 * 
 * 
 */
public class PatternDemo {
public static void main(String[] args) {
	/*
	 * 12345
	 * 12345
	 * 12345
	 * 12345
	 */
//	for (int i = 1; i <=4; i++) {
//		for (int j = 1; j <=5; j++) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
	
	/*
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * 
	 * for i:
	 * 		ini :first num in pattern
	 * 		cond:last number in pattern
	 * 		
	 * min to max : <= :++
	 * max to min :>= :--
	 * for j:
	 * first col of each row:
	 * same no :that number only
	 * diff no :upper loop name
	 * 
	 * cond:
	 * same no :that number only
	 * diff no :upper loop name
	 * 
	 * third row :
	 * min to max : <= :++
	 * max to min :>= :--
	 * 
	 * 1
	 * 10
	 * 101
	 * 1010
	 * 10101
	 * 1
	 * 12
	 * 123
	 * 1234
	 * 12345
	 * %2
	 * 
	 * +++++1
	 * ++++1 2
	 * +++1 2 3
	 * ++1 2 3 4
	 * +1 2 3 4 5
	 * 
	 * k :same as i loop
	 * 
	 *      *  	1   1*2  2-1
	 *     *** 	3 	2*2  4-1
	 *    *****	5	3*2  6-1
	 *     ***
	 *      *
	 */
	
	for (int i = 1; i <=3; i++) {
		for (int k = i; k <=3; k++) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i*2-1; j++) {
		
			
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = 2; i >=1; i--) {
		for (int k = i; k <=3; k++) {
			System.out.print(" ");
		}
		for (int j = i*2-1; j >=1; j--) {
		
			
			System.out.print("*");
		}
		System.out.println();
	}
}
}
