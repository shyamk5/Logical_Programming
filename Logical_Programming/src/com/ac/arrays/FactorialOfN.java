package com.ac.arrays;

/*
 * 	This Program is Developed to Find the Factorial of a Given Number
 */

import java.util.Scanner;

public class FactorialOfN {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("This Program is Developed to Find the Factorial of a Given Number...");

		loop:while(true) {
			System.out.print("Please Enter a Number: ");
			int n = scn.nextInt(); scn.nextLine();

			int res = n;

			if(n <= 0) {
				break loop;
			}

			for(int i=(n-1); i>=1; i--) {
				res = res*i;
			}
			System.out.println("Factorial of "+n+" = "+res+"\n");
		}//while End

		scn.close();
	}

}