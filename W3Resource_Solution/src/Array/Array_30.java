package Array;
/*
 * Write a Java program to check if an array of integers without 0 and -1.
 * 
 * */
public class Array_30 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 1, 2, 1, 10 };
		
		boolean containZeroMinus = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0 || arr[i] == -1) {
				containZeroMinus = true;
			}
		}
		
		if (containZeroMinus) {
			System.out.println("Tha array contains 0 or -1");
		} else {
			System.out.println("The array does't contain 0 and -1");
		}
	}

}
