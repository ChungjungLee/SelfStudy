package Array;
/*
 * Write a Java program to check if an array of integers contains 
 * two specified elements 65 and 77
 * 
 * */
public class Array_32 {

	public static void main(String[] args) {
		int[] arr = { 1, 45, 23, 55, 12, 66, 65, 90 };
		
		boolean isContain = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 65 || arr[i] == 77) {
				isContain = true;
				break;
			}
		}
		
		if (isContain) {
			System.out.println("found");
		} else {
			System.out.println("not found");
		}
	}

}
