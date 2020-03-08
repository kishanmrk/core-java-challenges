/**
 * 
 */
package com.kishan.algorithmsorting;

/**
 * @author Kishankumar Feb 26, 2020
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 20, 15, 30, 5, 75 };
		selectionSortArr(arr);
	}

	static void selectionSortArr(int[] arr) {
		if (arr != null && arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				int smallestIndex = i;
				
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j] < arr[smallestIndex]) {
						smallestIndex = j;
					}
				}
				if(arr[smallestIndex] < arr[i]) {
					int temp = arr[i];
					arr[i] = arr[smallestIndex];
					arr[smallestIndex] = temp;
				}
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
