package com.ac.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeTestJCF {

	public static void main(String[] args) {
		Deque<Integer> d = new LinkedList<Integer>();
		
		d.add(1);
		d.add(2);
		d.add(3);
		d.add(4);
		d.add(5);
		
		System.out.println(d);
		
		while(!d.isEmpty()) {
			System.out.println(d.peek());
			d.poll();
		}
		
		System.out.println(d);
		
		Deque<Object> dq = new LinkedList<Object>();
		
		dq.addFirst(50.25);
		dq.addFirst(50);
		dq.addFirst(true);
		dq.addFirst(null);
		dq.addFirst("Shyam");
		dq.addFirst('S');
		
		dq.add("sk");
		
		System.out.println("First Element::: "+dq.getFirst());
		System.out.println("Last Element::: "+dq.getLast());
		
		while(!dq.isEmpty()) {
			System.out.println(dq.peek());
			dq.poll();
		}

	}

}
