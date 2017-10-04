package Array;
/*
 * Write a Java program to find the number of 
 * even and odd integers in a given array of integers
 * 
 * */
public class Array_27 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 7, -1 };
		int numOfEven = 0;
		int numOfOdd = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				numOfEven++;
			} else {
				numOfOdd++;
			}
		}
		
		System.out.println("# of even: " + numOfEven);
		System.out.println("# of odd: " + numOfOdd);
	}

}
