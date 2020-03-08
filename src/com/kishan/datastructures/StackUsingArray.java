package com.kishan.datastructures;

import java.util.Scanner;

/* Stack Implementation using Array - Fixed size Stack */

/**
 * @author Kishankumar
 *
 */
public class StackUsingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		StackArray s = new StackArray(size);
		
		s.push(10);
		s.push(70);
		s.push(60);
		s.push(40);
		System.out.println("Is Stack full::" + s.isFull());
		System.out.println("Is Stack Empty::" + s.isEmpty());
		System.out.println("Stack Size::" + s.size());
		s.pop();
		s.pop();
		System.out.println("Is Stack full::" + s.isFull());
		System.out.println("Is Stack Empty::" + s.isEmpty());
		System.out.println("Stack Size::" + s.size());
		sc.close();
	}

}

class StackArray {

	int size;
	int[] arr;
	int top;

	StackArray(int size) {
		this.size = size;
		arr = new int[size];
		this.top = -1;
	}

	void push(int val) {
		if (!isFull()) {
			top++;
			arr[top] = val;
			System.out.println("Pushed element::" + arr[top]);
		} else {
			System.out.println("Stack is full!!");
		}
	}

	int pop() {
		if (!isEmpty()) {
			int returnedTop = arr[top];
			top--;
			System.out.println("Popped element::" + returnedTop);
			return returnedTop;
		} else {
			System.out.println("Stack is empty!!");
		}
		return -1;
	}

	public int peek() {
		if (!this.isEmpty())
			return arr[top];
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}

	boolean isFull() {
		return (top == (size - 1));
	}

	boolean isEmpty() {
		return (top == -1);
	}

	int size() {
		return top +1;
	}

}