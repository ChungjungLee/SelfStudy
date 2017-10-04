package Method;
/*
 * Write a Java method to check whether a year (integer) 
 * entered by the user is a leap year or not.
 * 
 * Expected Output:
 * Input a year: 2017
 * false
 * 
 * */
import java.util.Scanner;

public class Method_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a year: ");
		int year = sc.nextInt();
		
		System.out.println("Result: " + isLeapYear(year));
	}
	
	public static boolean isLeapYear(int year) {
		if (((year % 4 == 0) && (year % 100 != 0)) 
			|| (year % 400 == 0)) {
			// is leap year
			return true;
		} else {
			// is not leap year
			return false;
		}
	}
}
