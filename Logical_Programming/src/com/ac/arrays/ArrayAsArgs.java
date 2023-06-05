package com.ac.arrays;

/*
 * 	Java Program on passing by reference for Array
 */

public class ArrayAsArgs {

	public static void update(int marks[], int a) {
		a = 10;
		for(int i=0; i<marks.length; i++) {
			marks[i] = marks[i] + 1;
		}
	}
	
	public static void main(String[] args) {
		int marks[] = {97, 98, 99};
		int a = 5;

		System.out.println("Before Update");
		System.out.println(a);

		for(int i=0; i<marks.length; i++) { 
			System.out.print(marks[i]+", ");
		}

		update(marks, a);

		System.out.println("\n\nAfter Update");
		System.out.println(a);

		for(int i=0; i<marks.length; i++) { 
			System.out.print(marks[i]+", ");
		}
		System.out.println();

	}

}