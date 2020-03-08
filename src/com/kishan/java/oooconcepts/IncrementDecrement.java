/**
 * 
 */
package com.kishan.java.oooconcepts;

/**
 * @author Kishankumar
 * Mar 1, 2020 
 */
public class IncrementDecrement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 1;
		a = a * b++;
		System.out.println(a);
		System.out.println(b);
		a = a * ++b;
		System.out.println(a);
		System.out.println(b);
		a = a * b--;
		System.out.println(a);
		System.out.println(b);
		a = a * --b;
		System.out.println(a);
		System.out.println(b);
	}

}
