package com.kishan.stringchallenges;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Kishankumar
 * Feb 15, 2020 
 */
public class AnagramTest {

	/* Check if two strings are anagrams when the characters are deleted and forms anagram
	 * 	Output the no of characters that need to be deleted to form anagram*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String first = sc.nextLine();
		String second = sc.nextLine();
		int[] letters = new int[26];
		if(first != null && second !=null) {
			for(char c: first.toCharArray()) {
				letters[c-'a']++;
			}
			for(char d: second.toCharArray()){
				letters[d-'a']--;
			}
			System.out.println(IntStream.of(letters).map(v -> Math.abs(v)).sum());
		}
		sc.close();
	}

}
