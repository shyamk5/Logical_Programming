package com.ac.arrays;

/*
 * 	Java Program for pairing all possible pairs from an Array
 */

public class ArrayPairs {

	public static void arrayPairs(int num[]) {
		int tp = 0;
		for(int i=0; i<num.length; i++) {
			int curr = num[i]; //optional

			for(int j=i+1; j<num.length; j++) {
				System.out.print("("+curr+","+num[j]+")\t");
				tp++;
			}

			System.out.println();
		}
		System.out.println("Total Pairs: "+tp);
	}
	
	public static void main(String[] args) {
		int num[] = {2,4,6,8,10};
		arrayPairs(num);

	}

}