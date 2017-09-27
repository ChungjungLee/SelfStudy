/*
 * Write a Java method to compute the sum of the digits in an integer.
 * 
 * Test Data:
 * Input an integer: 25
 * 
 * Expected Output:
 * The sum is 7 
 */
import java.util.Scanner;

public class Method_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input an integer: ");
		int num = sc.nextInt();
		
		System.out.println("The sum is " + sumOfDigits(num));
	}

	public static int sumOfDigits(int num) {
		int sum = 0;
		
		while (num != 0) {
			sum = sum * 10 + (num % 10);
			num = num / 10;
		}
		
		return sum;
	}
}
