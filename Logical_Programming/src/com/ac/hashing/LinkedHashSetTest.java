package com.ac.hashing;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("India");
		lhs.add("USA");
		lhs.add("China");
		lhs.add("UAE");
		lhs.add("Australia");
		
		System.out.println(lhs); //Not in a sorted manner (As it is)
		
		

	}

}
