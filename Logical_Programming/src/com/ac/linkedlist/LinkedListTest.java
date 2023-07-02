package com.ac.linkedlist;

public class LinkedListTest {

	public static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}//Node
	
	public static Node head;
	public static Node tail;
	public static int size;
	
	public void addFirst(int data) {
		//Step 1: create new Node
		Node newNode = new Node(data);
		size++;
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		//step 2: newNode next = head
		newNode.next = head; //link
		
		//step 3: head = newNode
		head = newNode;
	}//addFirst
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}//addLast
	
	public void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}//print
	
	public void add(int idx, int data) {
		Node newNode = new Node(data);
		size++;
		Node temp = head;
		int i = 0;
		
		while(i < idx-1) {
			temp = temp.next;
			i++;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
	}//add
	
	public int removeFirst() {
		if(size == 0) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		} else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}//removeFirst
	
	public int removeLast() {
		if(size == 0) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		} else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		//prev: i = size-2
		Node prev = head;
		for(int i=0; i<size-2; i++) {
			prev = prev.next;
		}
		
		int val = tail.data;
		prev.next = null;
		tail = prev;
		size--;
		return val;
	}//removeLast
	
	public int itrSearch(int key) {
		Node temp = head;
		int i = 0;
		
		while(temp != null) {
			if(temp.data == key) {
				return i;
			}
			temp = temp.next;
			i++;
		}
		//if key not found
		return -1;
	}//itrSearch
	
	public void reverse() {
		Node prev = null;
		Node curr = tail = head;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}//reverse
	
	public void deleteNthFromLast(int n) {
		//calculate size
		int sz = 0;
		Node temp = head;
		while(temp != null) {
			temp = temp.next;
			sz++;
		}
		
		if(n == sz) {
			head = head.next;
			return;
		}
		
		//sz-n
		int i = 1;
		int iToFind = sz-n;
		Node prev = head;
		while(i < iToFind) {
			prev = prev.next;
			i++;
		}
		
		prev.next = prev.next.next;
		return;
		
	}//deleteNthFromLast
	
	public static void main(String[] args) {
		LinkedListTest ll = new LinkedListTest();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(3);
		ll.addLast(4);
		ll.print();
		
		ll.add(2, 9);
		ll.print();
		
		System.out.println(ll.size);
		
		ll.removeFirst();
		ll.print();
		System.out.println(ll.size);
		
		ll.removeLast();
		ll.print();
		System.out.println(ll.size);
		
		System.out.println(ll.itrSearch(3));
		
		ll.addLast(4);
		ll.addLast(5);
		ll.addLast(6);
		
		ll.print();
		ll.reverse();
		ll.print();
		
		ll.deleteNthFromLast(3);
		ll.print();
		
		
	}//main

}//class
