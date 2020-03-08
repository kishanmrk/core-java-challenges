/**
 * 
 */
package com.kishan.stringchallenges;

/**
 * @author Kishankumar Feb 29, 2020
 */
public class StringComparison {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("test");
		String s2 = new String("test");
		String s3 = new String("test2");
		String s4 = "test";
		String s5 = "test";

		System.out.println("String Comparison TEST - start::::");
		if (s1 == s2) {
			System.out.println("s1, s2 are objects with same value using operator: true");
		} else {
			System.out.println("s1, s2 are objects with same value using operator: false");
		}
		System.out.println("s1, s2 are objects with same value using equals: " + s1.equals(s2));
		System.out.println("s1, s3 are objects with different value using equals: " + s1.equals(s3));
		if (s1 == s4) {
			System.out.println("s1 -object, s4 -literal are objects with same value using operator: true");
		} else {
			System.out.println("s1 -object, s4 -literal are objects with same value using operator: false");
		}

		System.out.println("s1 -object, s4 -literal are objects with same value using equals: " + s4.equals(s1));
		if (s5 == s4) {
			System.out.println("s4, s5 are literals with same value using operator: true");
		} else {
			System.out.println("s4, s5 are literals with same value using operator: false");
		}
		System.out.println("String Comparison TEST - end::::");
	}

}
