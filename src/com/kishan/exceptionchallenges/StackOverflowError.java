package com.kishan.exceptionchallenges;


/**
 * @author Kishankumar
 * Feb 19, 2020 
 */
public class StackOverflowError {

	/*Stack is used for execution of methods. For every method call, one frame or block is created in the stack memory. 
	 * The data related to method like parameters, local variables or references to objects are stored in this block. 
	 * When the method finishes its execution, this block is removed from the stack along with data stored in it.
	 * Whenever you call a method, it must finish its execution and leave the stack memory. 
	 * If your methods are staying in the stack then stack will be full and JVM will throw java.lang.StackOverflowError.
	 * In most of time, StackOverflowError occurs when your program is calling a method recursively without proper terminating condition. 
	 * Below example demonstrates the StackOverflowError.*/
	
	private static void addItself(int i)
	{
		addItself(i+i);   //calling itself with no terminating condition
	}
	
	public static void main(String[] args) 
	{
		addItself(10);
	}

}
