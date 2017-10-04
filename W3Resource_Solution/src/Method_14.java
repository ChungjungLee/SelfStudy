/*
 * Write a Java method to create the area of a pentagon.
 * 
 * Expected Output:
 * Input the number of sides: 5
 * Input the side: 6
 * The area of the pentagon is 61.93718642120281
 * 
 * */
import java.util.Scanner;

public class Method_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the number of sides: ");
		int numOfSide = sc.nextInt();
		System.out.print("Input the side: ");
		int lenOfSide = sc.nextInt();
		
		System.out.println("The area of the pentagon is " + areaPentagon(numOfSide, lenOfSide));
		
		sc.close();
	}
	
	public static double areaPentagon(int numOfSide, int lenOfSide) {		
		/*
		 * n-각형의 내각의 합 = (n-2) * 180
		 * 정오각형의 한 내각 = 108도
		 * 삼각함수를 이용하여 삼각형의 높이를 구한다
		 * 
		 * */
		double angle = (numOfSide - 2) * 180 / numOfSide;
		double height = (lenOfSide / 2) * Math.tan(Math.toRadians(angle / 2));
		
		double area = (lenOfSide * height / 2) * numOfSide;
		
		return area;
	}

}
