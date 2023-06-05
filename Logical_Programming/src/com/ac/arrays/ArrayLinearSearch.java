package com.ac.arrays;

/*
 * 	Java Program for simple Array Linear Search
 */

public class ArrayLinearSearch {

	public static int linearSearch(int marks[], int key) {
		for(int i=0; i<marks.length; i++) {
			if(marks[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		int marks[] = {10,5,8,46,95,7,1,2,4};
		int key = 2;

		int index = linearSearch(marks,key);
		
		if(index == -1)
			System.out.println("Not Found");
		else
			System.out.println(key+" is found at the index of "+index);

	}

}