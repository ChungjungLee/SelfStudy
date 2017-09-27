/*
 * Write a Java method to find the smallest number among three numbers.
 * 
 * Test Data:
 * Input the first number: 25
 * Input the Second number: 37
 * Input the third number: 29
 * 
 * Expected Output:
 * The smallest value is 25.0
 * 
 */
import java.util.Scanner;

public class Method_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Input the third number: ");
		int num3 = sc.nextInt();
		
		System.out.println(
				"The smallest value is " + 
				smallestNumber(num1, num2, num3)
		);
		
		sc.close();
	}
	
	public static int smallestNumber(int num1, int num2, int num3) {
		int result = (num1 < num2) ? num1 : num2;
		result = (num3 < result) ? num3 : result;
		
		return result;
	}
}
