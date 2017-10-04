package Array;


/*
 * Write a Java program to remove the duplicate elements of 
 * a given array and return the new length of the array.
 * Sample array: [20, 20, 30, 40, 50, 50, 50]
 * After removing the duplicate elements 
 * the program should return 4 as the new length of the array.
 * 
 */

public class Array_33 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 20, 40, 50, 60, 60, 90 };
		
		int lenOfNewArr = (arr.length == 0) ? 0 : 1;
		
		// assume the given array is sorted
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i+1]) {
				continue;
			}
			// arr[i] != arr[i+1];
			// 서로 다르기 때문에 not duplicate
			lenOfNewArr++;
		}
		
		System.out.println("length of the new array: " + lenOfNewArr);
	}

}
