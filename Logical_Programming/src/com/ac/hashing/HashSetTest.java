package com.ac.hashing;

import java.util.HashMap;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("India", 150);
		hm.put("China", 120);
		hm.put("Pak", 180);
		hm.put("USA", 170);
		hm.put("UAE", 110);
		
		//Iterate
		Set<String> keys = hm.keySet();
		
		System.out.println(keys); //[USA, China, UAE, Pak, India]
		
		for(String k : keys) {
			System.out.println("Key:  "+k+",  Value:  "+hm.get(k));
		}

	}

}
