package com.ac.recursion;

/*
 * 		Finding the Sum of N Natural numbers using recursion method
 * 		time complexity will be     bigO(n)
 */

public class SumOfNaturalNnum {

	public static int calcSum(int n) {
		if(n == 1) {
			return 1;
		}
		int summ = calcSum(n-1);
		int sum = n + summ;
		return sum;
	}
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(calcSum(n));

	}

}
