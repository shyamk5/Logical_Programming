package com.ac.sorting;

/*
 * 	Program for Bubble Sort
 * 	Time Complexity  O(n^2)
 * 
 */

class BubbleSorting {
	
	public static void BubbleSort(int[] arr) {
		for(int turn=0; turn<arr.length-1; turn++) {
			for(int j=0; j<arr.length-1-turn; j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}//if
			}
		}
	}

	public static void printSortedArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,4,1,3,2};
		BubbleSort(arr);
		printSortedArray(arr);
	}
}
