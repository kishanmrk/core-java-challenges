package com.kishan.datastructures;

/**
 * @author Kishankumar
 *
 */
public class SortStackUsingStack {

	private static class Stack {
		int arr[];
		int size;
		int top;
		
		Stack(int size) {
			this.size = size;
			arr = new int[size];
			top=-1;
		}
		
		void push(int data) {
			if(!isFull()) {
				top++;
				arr[top]=data;
				System.out.println("Pushed item::" + arr[top]);
			} else {
				System.out.println("Stack is Full!!");
			}
		}
		
		int pop() {
			if(!isEmpty()) {
				int v = arr[top];
				top--;
				System.out.println("Popped item is::" + v);
				return v;
			} else {
				System.out.println("Stack is Empty!!");
				return -1;
			}
		}	
		
		int peek() {
			return top != -1 ? arr[top] : -1;
		}
		
		boolean isFull() {
			return top == size-1;
		}
		
		boolean isEmpty() {
			return top == -1;
		}
		
		Stack sortedStack(Stack stk) {
			Stack tempStack = new Stack(size);
			while(!stk.isEmpty()) {
				 int currentData = stk.pop();
				 while(!tempStack.isEmpty() && tempStack.peek() > currentData) {
					 stk.push(tempStack.pop());
				 }
				 tempStack.push(currentData);
			}			
			return tempStack;
		}
		
		void print(Stack stk) {
			if(!stk.isEmpty()) {
				for(int i=0;i<=top;i++) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Stack stackCustom = new Stack(10);
		System.out.println("=================");
		stackCustom.push(10);
		stackCustom.push(30);
		stackCustom.push(50);
		stackCustom.push(40);
		stackCustom.print(stackCustom);
		Stack sortedStack=stackCustom.sortedStack(stackCustom);
		System.out.println("=================");
		System.out.println("After Sorting :");
		System.out.println("=================");
		sortedStack.print(sortedStack);
	}

}
