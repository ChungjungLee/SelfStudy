package Array;
/*
 * Write a Java program to check if the sum of all the 10's in the array is exactly 30. 
 * Return false if the condition does not satisfy, otherwise true.
 * 
 * */
public class Array_31 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 10, 19, 12, 10, 55 };
		
		int count10 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 10) {
				count10++;
			}
		}
		
		if (count10 == 3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
