package com.ac.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(); //by default ascending order
		//PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //descending order
		
		pq.add(3);
		pq.add(4);
		pq.add(1);
		pq.add(7);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek());
			pq.remove();
		}
		
	}

}
