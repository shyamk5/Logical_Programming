package com.ac.arrays;

/*
 * Java Program for Linear Search Dynalically
 */

import java.util.Scanner;

public class DynamicArrayLinearSearch {

	//method for performing the Linear Search
	public static int linearSearch(int num[], int key) {
		
		//loop for finding the required number in Array
		for(int i=0; i<num.length; i++) {
			if(num[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		//Scanner object Creation
		Scanner scn = new Scanner(System.in);

		//Array Creation
		int num[] = {10,20,30,40,50,60,70,80,90,55,44,66,88,77,99,11};

		//Reading values from end user
		System.out.print("Enter a Number: ");
		int key = scn.nextInt();

		int index = linearSearch(num,key);

		//Printing the Result for the End User
		if(index == -1)
			System.out.println("\nSorry Not Found");
		else
			System.out.println("\n"+key+" is at index of "+index);

		scn.close();
	}

}