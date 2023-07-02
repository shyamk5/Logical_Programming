package com.ac.arraylist;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		int indx1 = 2;
		int indx2 = 3;
		System.out.println(list);
		swap(list,indx1, indx2);
		System.out.println(list);
	}

	private static void swap(ArrayList<Integer> list, int indx1, int indx2) {
		int temp = list.get(indx1);
		list.set(indx1, list.get(indx2));
		list.set(indx2, temp);
		
		
	}

}
