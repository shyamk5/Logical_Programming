package com.ac.recursion;

/*
 * 		Finding Factorial of N using recursion method
 * 		time complexity will be     bigO(n)
 */

public class FactorialOfN {

	public static int factOfN(int n) {
		if(n == 0) {
			return 1;
		}
		int fnn = factOfN(n-1);
		int fn = n * factOfN(n-1);
		return fn;
	}
	
	public static void main(String[] args) {
		int n = 5;
		System.out.println(factOfN(n));

	}

}
