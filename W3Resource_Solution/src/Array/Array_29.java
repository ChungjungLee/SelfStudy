package Array;
/*
 * Write a Java program to compute the average value of 
 * an array of integers except the largest and smallest values
 * 
 * */
public class Array_29 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, -1};

		int max = arr[0];
		int min = arr[0];
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			total += arr[i];
		}
		
		total = total - max - min;
		double average = (double)total / (arr.length - 2);
		
		System.out.println("average without max and min: " + average);
	}

}
