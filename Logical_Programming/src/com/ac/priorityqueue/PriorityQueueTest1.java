package com.ac.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest1 {

	static class Student implements Comparable<Student> {
		String name;
		int rank;
		
		public Student(String name, int rank) {
			this.name = name;
			this.rank = rank;
		}

		@Override
		public int compareTo(Student s2) {
			return this.rank - s2.rank;
		}
	}
	
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		//PriorityQueue<Student> pq = new PriorityQueue<Student>(Comparator.reverseOrder());
		
		pq.add(new Student("Shyam", 5));
		pq.add(new Student("Pawan", 7));
		pq.add(new Student("Amrendra", 2));
		pq.add(new Student("Deepak", 1));
		pq.add(new Student("Nandu", 8));
		pq.add(new Student("Deena", 12));
		pq.add(new Student("Mangal", 15));
		
		while(!pq.isEmpty()) {
			System.out.println(pq.peek().name+" -> "+pq.peek().rank);
			pq.remove();
		}
	}

}
