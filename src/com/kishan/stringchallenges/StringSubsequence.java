package com.kishan.stringchallenges;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/* Find different unique subsequences of a given string */
/**
 * @author Kishankumar
 * Feb 20, 2020 
 */
public class StringSubsequence {
	
	static SortedSet<String> set = new TreeSet<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str != null && str.length() == 1) {
			set.add(str);
		} else if(str!= null && str.length() > 1){
			subSequences(str);
		}
		
		System.out.println(set);
		sc.close();
	}
	
	public static void subSequences(String str) {
		for(int i=0;i<str.length();i++) {
			
            // iterate from the end of the string 
            // to generate substrings 
			for(int j=str.length();j>i;j--) {
				String s = str.substring(i,j);
				if(!set.contains(s)) {
					set.add(s);
				}
				
                // drop kth character in the substring 
                // and if its not in the set then recur 
				for(int k=1;k<s.length()-1;k++) {
					StringBuilder sb = new StringBuilder(s);
                    // drop character from the string 
					sb.deleteCharAt(k);
					if(!set.contains(sb.toString())){
						subSequences(sb.toString());
					}
				}
				
			}
		}
	}

}
