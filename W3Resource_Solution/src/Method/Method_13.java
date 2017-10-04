package Method;
/*
 * Write Java methods to calculate the area of a triangle. 
 * 
 * Expected Output:
 * Input Side-1: 10
 * Input Side-2: 15
 * Input Side-3: 20
 * 
 * The area of the triangle is 72.6184377413890
 */
import java.util.Scanner;

public class Method_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Side-1: ");
		int side1 = sc.nextInt();
		System.out.print("Input Side-2: ");
		int side2 = sc.nextInt();
		System.out.print("Input Side-3: ");
		int side3 = sc.nextInt();
		
		System.out.println("The area of the triangle is " 
							+ triangleArea(side1, side2, side3));
	}
	
	public static double triangleArea(int side1, int side2, int side3) {
		// 헤론의 공식 이용
		// area = squareroot(s(s-a)(s-b)(s-c)); s = a+b+c / 2
		double s = (side1 + side2 + side3) / 2.0;
		
		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}
}
