package com.ac.arrays;

/*
 * 	Java Program for finding the largest and smallest number from an Array
 */

public class LargestNSmallest {

	public static int largestSearch(int num[]) {
		int x = Integer.MIN_VALUE;

		for(int i=0; i<num.length; i++) {
			
			if(x < num[i]) {
				x = num[i];
			}
		}
		return x;
	}

	public static int smallestSearch(int num[]) {
		int y = Integer.MAX_VALUE;

		for(int i=0; i<num.length; i++) {
			
			if(y > num[i]) {
				y = num[i];
			}
		}
		return y;
	}


	
	public static void main(String[] args) {
		
		int num[] = {10,20,30,40,50,1,88,99,77,66,44,2};
		
		System.out.println("The Largest Number is "+largestSearch(num));
		System.out.println("The Smallest Number is "+smallestSearch(num));

	}

}