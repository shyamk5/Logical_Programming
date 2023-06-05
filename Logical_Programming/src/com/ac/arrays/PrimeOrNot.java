package com.ac.arrays;

/*
 * 	Java Program for checking an entered number is prime or not
 */

import java.util.Scanner;

public class PrimeOrNot {

public static void main(String[] args) {
		
		while(true) {
			Scanner scn = new Scanner(System.in);

			System.out.print("Enter a Number: ");
			int n = scn.nextInt();

			if(n<=1) {
				break;
			}

			if(n==2) {
				System.out.println("Prime Number\n");
			} else {

				Boolean isPrime = true;
				for(int i=2; i<=Math.sqrt(n); i++) {
					if(n%i == 0) {
						isPrime = false;
					}
				}

				if(isPrime==true) {
					System.out.println("Prime Number\n");
				} else {
					System.out.println("Not a Prime Number\n");
				}
			}
		}//while
	}//main

}//class