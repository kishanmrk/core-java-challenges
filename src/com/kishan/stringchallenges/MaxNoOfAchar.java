package com.kishan.stringchallenges;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Kishankumar
 * Feb 16, 2020 
 */
public class MaxNoOfAchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		if(str != null && str.length() >0) {
			
			for(int i=0;i<str.length();i++) {
				if(map.containsKey(str.charAt(i))) {
					int count = map.get(str.charAt(i)).intValue() + 1;
					map.put(str.charAt(i), new Integer(count));
				} else {
					map.put(str.charAt(i), 1);
				}
			}
			
			/*map.forEach((k,v) -> {
				System.out.println(k);
				System.out.println("val::"+ v);
			});*/

			Map.Entry<Character, Integer> maxEntry = null;
			for (Map.Entry<Character, Integer> entry : map.entrySet())
			{
			    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
			    {
			        maxEntry = entry;
			    }
			}
			System.out.println("MaxKey::" + maxEntry.getKey());
			System.out.println("MaxVAl::" + maxEntry.getValue());
		}
		sc.close();
	}

}
