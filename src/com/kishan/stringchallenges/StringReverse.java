package com.kishan.stringchallenges;

import java.util.Scanner;

/*get reverse of a string manually without using string builder and with using string builder*/

/**
 * @author Kishankumar
 * Feb 23, 2020 
 */
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println("After reverseStringManually::" + reverseStringManually(s));
		System.out.println("After reverseUsingStringBuilder::" + reverseUsingStringBuilder(s));
		sc.close();
	}

	static String reverseStringManually(String str) {
		StringBuilder sb = new StringBuilder();
		if (str != null) {
			for (int i = str.length() - 1; i >= 0; i--) {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}

	static String reverseUsingStringBuilder(String str) {
		StringBuilder sb = new StringBuilder();
		if (str != null) {
			sb.append(str);
		}
		return sb.reverse().toString();
	}

}
