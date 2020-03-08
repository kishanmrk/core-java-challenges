package com.kishan.stringchallenges;

import java.util.Scanner;


/**
 * @author Kishankumar
 * Feb 15, 2020 
 */
public class DistinctAlternatingChars {

	/*You are given a string containing characters  and  only. Your task is to change it into 
	 * a string such that there are no matching adjacent characters. To do this, 
	 * you are allowed to delete zero or more characters in the string.
	 * Your task is to find the minimum number of required deletions.*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str != null) {
			int noOfDels = 0;
			for(int i=0;i<str.length()-1;i++) {
				if(str.charAt(i) == str.charAt(i+1)) {
					noOfDels++;
				}
			}
			System.out.println(noOfDels);
			
		}
		sc.close();
	}

}
