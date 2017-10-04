package Array;

/*
 * Write a Java program to find the sum of the two elements 
 * of a given array which is equal to a given integer.
 * 
 * Sample array: [1,2,4,5,6]
 * Target value: 6.
 * Sample output: index 1, 2
 * 
 */
public class Array_35 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 };
		int target = 6;
		// 정렬되었다 가정
		
		for (int i = 0; i < arr.length; i++) {
			if (target < arr[i]) {
				//더 이상 만족하는 조합이 없다
				break;
			} 
			
			int newTarget = target - arr[i];
			
			for (int j = i + 1; j < arr.length; j++) {
				if (newTarget < arr[j]) {
					//더 이상 만족하는 조합이 없다
					break;
				} else if (newTarget == arr[j]) {
					//찾음
					System.out.println("Index " + i + " and index " + j);
				}
			}
		}
	}
}
