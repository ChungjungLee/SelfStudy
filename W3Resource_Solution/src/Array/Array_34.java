package Array;

/*
 * Write a Java program to find the length of 
 * the longest consecutive elements sequence 
 * from a given unsorted array of integers.
 * 
 * Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
 * The longest consecutive elements sequence is 
 * [1, 2, 3, 4, 5], therefore the program will return its length 5.
 * 
 */

public class Array_34 {
	
	public static void main(String[] args) {
		//int[] arr = { 49, 1, 3, 200, 2, 4, 70, 5 };
		int[] arr = { 1, 2, 3, 4, 7, 8, 9, 10, 11, 12};
		// 1)sort the given array
		// 2)find the longest consecutive elems
		
		insertionSort(arr);
		int result = findLongestConsecutive(arr);
		
		System.out.println("Longest Consecutive Elements: " + result);
	}
	
	static void insertionSort(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minIndex] > arr[j]) {
					// j element is bigger, needed to be swapped
					minIndex = j;
				}
			}
			
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;			
		}
				
	}
	
	static int findLongestConsecutive(int[] arr) {
		int result = 0;
		
		int startIndex = 0;				// 찾기를 시작하는 요소의 인덱스
		int currentIndex;
		
		while (startIndex <= arr.length - 1) {
			int numOfConsecutive = 1;
			
			for (currentIndex = startIndex + 1; currentIndex < arr.length; currentIndex++) {
				if (arr[currentIndex] - arr[currentIndex - 1] != 1) {
					// non-consecutive
					break;
				}
				
				// consecutive
				numOfConsecutive++;
			}
			
			if (result < numOfConsecutive) {
				result = numOfConsecutive;
			}
			
			//startIndex = currentIndex;
			startIndex += numOfConsecutive;
			
		}	// end of while
		
		
		
		return result;
	}
	
}
