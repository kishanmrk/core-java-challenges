/**
 * 
 */
package com.kishan.arraychallenges;

/**
 * @author Kishankumar Feb 26, 2020
 */
public class ArrayShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 20, 15, 30, 5, 75 };
		System.out.println("BEFORE ROTATING ARRAY");
		printArray(arr);
		//shiftRightArray(arr, 1);
		shiftLeftArray(arr, 1);
	}

	static void shiftLeftArray(int[] arr, int shift) {
		if (arr != null && arr.length > 1) {
			for (int i = 0; i < shift; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("AFTER ROTATING ARRAT LEFT");
			printArray(arr);
		}
	}

	static void shiftRightArray(int[] arr, int shift) {
		if (arr != null && arr.length > 1) {
			for (int i = 0; i < shift; i++) {
				for (int j = arr.length - 1; j > 0; j--) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
			System.out.println("AFTER ROTATING ARRAT RIGHT");
			printArray(arr);
		}
	}

	static void printArray(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
	}

}
