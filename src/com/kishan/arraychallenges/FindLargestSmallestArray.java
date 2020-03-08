/**
 * 
 */
package com.kishan.arraychallenges;

import java.util.Scanner;

/*You are given an array of numbers. You need to find smallest and largest numbers in the array.*/

/**
 * @author Kishankumar Feb 26, 2020
 */
public class FindLargestSmallestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Largest::" + largest);
		System.out.println("Smallest::" + smallest);
	}

}
