package Array;
/*
 * Write a Java program to get the difference between the largest and smallest values 
 * in an array of integers. The length of the array must be 1 and above.
 *  
 * */
public class Array_28 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, -1};
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println("difference b/w max and min: " + (max - min));
	}

}
