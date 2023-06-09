package com.ac.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTestUsingJCF {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.poll();
		}
		
		System.out.println(q);
		
	}

}
