/**
 * 
 */
package com.kishan.stringchallenges;

/**
 * @author Kishankumar
 * Feb 25, 2020 
 */
public class StringCompareTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "apple";
		String s2 = "zen";
		System.out.println(s1.compareTo(s2));
		String o1 = new String("apple");
		String o2 = new String("apple");
		String o3 = new String("zen");
		System.out.println(o1.compareTo(o2));
		System.out.println(o1.compareTo(o3));
		System.out.println(o2.compareTo(o3));
		System.out.println(o3.compareTo(o1));
		System.out.println(o3.compareTo(o3));
	}

}
