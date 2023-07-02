package com.ac.arraylist;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<Boolean> list3 = new ArrayList<>();
		
		list.add(1);
		list.add(85);
		list.add(457);
		list.add(63);
		
		System.out.println(list); //[1, 85, 457, 63]
		System.out.println(list.get(3)); //63
		
		list.remove(3);
		System.out.println(list); //[1, 85, 457]
		

	}

}
