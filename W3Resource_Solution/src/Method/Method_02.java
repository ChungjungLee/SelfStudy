package Method;
/*
 * Write a Java method to compute the average of three numbers.
 * 
 * Test Data:
 * Input the first number: 25 
 * Input the second number: 45
 * Input the third number: 65
 * 
 * Expected Output:
 * The average value is 45.0
 */
import java.util.Scanner;


public class Method_02 {

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
				averageAmongThree(num1, num2, num3)
		);
		
		sc.close();
	}
	
	public static double averageAmongThree(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3.0;
	}

}
