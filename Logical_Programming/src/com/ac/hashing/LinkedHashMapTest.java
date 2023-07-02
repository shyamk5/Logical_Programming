package com.ac.hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		
		lhm.put("India", 120);
		lhm.put("China", 180);
		lhm.put("USA", 190);
		lhm.put("UAE", 150);
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("India", 120);
		hm.put("China", 180);
		hm.put("USA", 190);
		hm.put("UAE", 150);
		
		System.out.println(lhm);
		System.out.println(hm);
		
	}
}
