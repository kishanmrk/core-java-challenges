package com.kishan.exceptionchallenges;


/**
 * @author Kishankumar
 * Feb 19, 2020 
 */
public class OutOfMemError {	
	
	/*	java.lang.OutOfMemoryError is thrown when the heap is full and JVM is unable to allocate the memory to new objects.
	The objects you create in java are stored in the heap memory. When the objects are no more required, they must be removed from the memory. Garbage collector removes the unwanted objects from the heap memory. If your objects have live references, garbage collector doesn’t remove them. It removes only those objects which don’t have live references.
	If there is no space left for new objects in the heap memory then JVM will throw java.lang.OutOfMemoryError.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			String s = new String();
			//System.out.println("String::"+ s);
		}
	}

}
