package com.ac.arrays;

/*
 * 	This program is meant for printing all the possible subArrays using an Array
 */

public class PrintSubArrays {

	public static void printSubArrays(int nums[]) {
		int ts = 0;
		for(int i=0; i<nums.length; i++) {
			int start = i;
			for(int j=i; j<nums.length; j++) {
				int end = j;
				for(int k=start; k<=end; k++) {//print
					System.out.print(nums[k]+" ");//subarrays
				}
				ts++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total SubArrays: "+ts);
	}


	public static void main(String[] args) {
		int nums[] = {2,4,6,8,10};
		printSubArrays(nums);
	}

}