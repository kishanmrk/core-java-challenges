package com.kishan.algorithmsorting;

/* Insertion sort works by comparing values at index with all its prior elements. 
 * We place value at the index where there are no lesser value to the elements. 
 * So when you reach last element,we get a sorted array.*/

/**
 * @author Kishankumar Feb 26, 2020
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 20, 15, 30, 5, 75 };
		insertionSortArr(arr);
	}

	static void insertionSortArr(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 1; i < arr.length; i++) {
				int valueToinsert = arr[i];
				int j;
				for (j = i; j > 0 && arr[j - 1] > valueToinsert; j--) {
					arr[j] = arr[j - 1];
				}
				arr[j] = valueToinsert;
				printArray(arr);
			}
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
