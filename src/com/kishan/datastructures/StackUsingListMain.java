package com.kishan.datastructures;

/* The Stack is an abstract data type that demonstrates Last in first out ( LIFO) behavior. 
 * We will implement the same behavior using Linked List.*/

/**
 * @author Kishankumar
 * Feb 23, 2020 
 */

public class StackUsingListMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingList stackObj = new StackUsingList();
		stackObj.push(10);
		stackObj.push(70);
		stackObj.push(60);
		stackObj.push(40);
		System.out.println("Is Stack Empty::" + stackObj.isEmpty());
		stackObj.pop();
		stackObj.pop();
		stackObj.pop();
		stackObj.pop();
		stackObj.pop();
	}
}

class StackUsingList {

	private Node head;

	private class Node {
		int data;
		Node next;

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}

	}

	StackUsingList() {
		head = null;
	}

	void push(int data) {
		Node oldHead = head;
		head = new Node();
		head.data = data;
		head.next = oldHead;
		System.out.println("Pushed element::" + head);
	}

	int pop() throws LinkedListEmptyException {
		if (isEmpty()) {
			throw new LinkedListEmptyException("Stack is empty!!");
		} else {
			System.out.println("Popped element::" + head);
			int val = head.data;
			head = head.next;
			return val;
		}
	}

	boolean isEmpty() {
		return head == null;
	}

}

class LinkedListEmptyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LinkedListEmptyException() {
		super();
	}

	public LinkedListEmptyException(String str) {
		super(str);
	}
}
