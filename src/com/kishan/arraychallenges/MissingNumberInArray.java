/**
 * 
 */
package com.kishan.arraychallenges;

/*You are given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. 
 * You need to provide optimum solution to find the missing number. 
 * Number can not be repeated in the array.*/

/**
 * @author Kishankumar Feb 25, 2020
 */
public class MissingNumberInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 6, 8, 2, 3, 1, 9, 7 };
		System.out.println("Missing number in an array::" + findMissingElement(a));
	}

	static int findMissingElement(int[] arr) {
		if (arr != null && arr.length > 0) {
			int len = arr.length + 1;
			int sum = len * (len + 1) / 2;
			int totalSum = 0;
			for (int i = 0; i < arr.length; i++) {
				totalSum = totalSum + arr[i];
			}
			int missingElement = sum - totalSum;
			return missingElement;
		}
		return -1;
	}

}
