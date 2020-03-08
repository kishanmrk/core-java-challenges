/**
 * 
 */
package com.kishan.algorithmsorting;

/**
 * @author Kishankumar Mar 1, 2020
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 20, 15, 30, 5, 1 };
		bubbleSortArr(arr);
	}

	static void bubbleSortArr(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 1; j < arr.length - i; j++) {
					if (arr[j] < arr[j-1]) {
						int temp = arr[j];
						arr[j] = arr[j-1];
						arr[j-1] = temp;
					}
					printArray(arr);
				}
			}
			//printArray(arr);
		}
	}

	static void printArray(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length; i++)
			   System.out.print(arr[i] + " "); 
			System.out.println(); 
		}
	}

}
