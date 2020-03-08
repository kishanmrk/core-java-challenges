package com.kishan.stringchallenges;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationTest {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("test");
		l.add("test1");
		l.add("test");
		
		boolean match = l.stream().allMatch(v-> {
			if(v.equals("test")){
				return true;
			} else {
				return false;
			}
		});
		boolean anymatch = l.stream().anyMatch(v-> {
			if(v.equals("test")){
				return true;
			} else {
				return false;
			}
		});
		System.out.println(match);
		System.out.println(anymatch);
		
		System.out.println(4/2);
		System.out.println(4%2);
		System.out.println(23/2);
		System.out.println(5%2);
	}

}
