package com.ac.divideConquer;

public class MergeSort {
	
	public static void mergeSort(int arr[], int si, int ei) {
		if(si >= ei) {
			return;
		}
		
		int mid = si + (ei - si)/2; //or (si + ei) / 2;
		mergeSort(arr, si, mid); //left
		mergeSort(arr, mid+1, ei); //right
		
		merge(arr, si, mid, ei);
	}
	
	public static void merge(int arr[], int si, int mid, int ei) {
		int temp[] = new int[ei-si+1];
		int i = si;   //index for first sorted part
		int j = mid+1;  //index for second sorted part
		int k = 0;
		
		while(i <= mid && j<= ei) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
			} else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}//while
		
		//for leftover elements of 1st sorted parts
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		
		//for leftover elements of 2nd sorted parts'
		while(j <= ei) {
			temp[k++] = arr[j++];
		}
		
		//copy temp to original array
		for(k=0, i=si; k<temp.length; k++, i++) {
			arr[i] = temp[k];
		}
		
	}//merge
	
	public static void displaySortedArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {6,3,9,5,2,8,-1574};
		mergeSort(arr, 0, arr.length-1);
		displaySortedArray(arr);
	}

}
