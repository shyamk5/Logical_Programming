package com.ac.hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTestCase {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		
		hs.add(12);
		hs.add(2);
		hs.add(6);
		hs.add(7);
		hs.add(1);
		hs.add(8);
		hs.add(9);
		
		System.out.println(hs.contains(2)); //true
		
		System.out.println(hs.size()); //7
		
		System.out.println();
		
		hs.remove(5);
		
		//Using Iterator
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		//Enhanced for loop
		for(int n : hs) {
			System.out.println(n);
		}
		System.out.println();
		
		
		hs.clear();
		System.out.println(hs.size()); //0

	}

}
