package com.lti.code;

/**
 * Monday Commit
 * @author Sanjeet Shandilya
 * @version 1.0
 */
public class Factorial {

	private static long factorial = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial = getFactorial(6);
		System.out.println(factorial);
	}
	
	public static long getFactorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		if(n < 0) {
			System.out.println("Invalid Argument passed");
			return -1;
		}
		for(int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
