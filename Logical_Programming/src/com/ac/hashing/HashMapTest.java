package com.ac.hashing;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		//Insert
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("USA", 180);
		hm.put("UAE", 170);
		hm.put("Indonesia", 160);
		
		System.out.println(hm);
		
		//Get
		int population = hm.get("India");
		System.out.println(population);
		System.out.println(hm.get("China"));
		
		//Contains
		System.out.println(hm.containsKey("India")); //true
		System.out.println(hm.containsKey("Nepal")); //false
		
		//remove
		System.out.println(hm.remove("China"));
		System.out.println(hm);
		
		//size
		System.out.println(hm.size());
		
		//Is Empty
		System.out.println(hm.isEmpty()); //false
		hm.clear();
		System.out.println(hm.isEmpty()); //true
		
		

	}

}
