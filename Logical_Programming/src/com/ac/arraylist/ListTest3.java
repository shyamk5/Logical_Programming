package com.ac.arraylist;

import java.util.ArrayList;
import java.util.Collections;

//Sorting using inbuilt methods

public class ListTest3 {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(5);
		aList.add(9);
		aList.add(2);
		aList.add(6);
		aList.add(4);
		System.out.println(aList);
		Collections.sort(aList);
		System.out.println(aList); //in assending order
		Collections.sort(aList, Collections.reverseOrder());
		System.out.println(aList);

	}

}
