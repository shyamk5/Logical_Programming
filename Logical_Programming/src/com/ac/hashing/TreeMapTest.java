package com.ac.hashing;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		
		tm.put("India", 120);
		tm.put("USA", 170);
		tm.put("China", 140);
		tm.put("UAE", 110);
		tm.put("Nepal", 190);
		tm.put("Indonesia", 190);
		
		System.out.println(tm);
		
	}

}
