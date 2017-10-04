package Array;
/*
 * Write a Java program to move all 0's to the end of an array. 
 * Maintain the relative order of the other (non-zero) array elements.
 * 
 * */
public class Array_26 {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 1, 0, 6, 0, 0, 5, 7, 9 };
		//2 1 0 6 0 0 5 7 9 0
		//2 1 6 0 0 5 7 9 0 0
		//2 1 6 0 5 7 9 0 0 0
		
		/*
		 * Solution #1
		 * 
		 * Time Complexity: O(n)
		 * Space Complexity: O(2n)
		 * 
		 * */
		int[] sortedArr = new int[arr.length];
		int beginIndex = 0;
		int endIndex = arr.length - 1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				sortedArr[endIndex] = arr[i];
				endIndex--;
			} else {
				sortedArr[beginIndex] = arr[i];
				beginIndex++;
			}
		}
		
		for (int i = 0; i < sortedArr.length; i++) {
			System.out.print(sortedArr[i] + " ");
		}
		System.out.println();
		
		
		/*
		 * Solution #2
		 * 
		 * Time Complexity: O()
		 * Space Complexity: O()
		 * 
		 * */
		beginIndex = 0;
		endIndex = arr.length - 1;
		
		while (beginIndex < endIndex) {
			if (arr[beginIndex] == 0) {
				// swap elements to the last position
				for (int i = beginIndex; i < endIndex; i++) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
				
				endIndex--;
			} else {
				beginIndex++;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
