/*
 * Write a Java method to compute the future investment value 
 * at a given interest rate for a specified number of years.
 * 
 *  Sample data (Monthly compounded) and Output:
 *  Input the investment amount: 1000
 *  Input the rate of interest: 10
 *  Input number of years: 5
 *  
 *  Expected Output:
 *  Years    FutureValue
 *  1            1104.71
 *  2            1220.39
 *  3            1348.18
 *  4            1489.35
 *  5            1645.31
 * */
import java.util.Scanner;

public class Method_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the investment amount: ");
		double investment = sc.nextInt();
		System.out.print("Input the rate of interest: ");
		double interest = sc.nextInt();
		System.out.print("Input number of years: ");
		int years = sc.nextInt();
		
		System.out.println("Years\tFutureValue");
		for (int i = 0; i < years; i++) {
			investment = futureValue(investment, interest / 12);
			// given interest is for 12-month
			System.out.printf("%d\t%.2f\n", i+1, investment);
		}
	}
	
	public static double futureValue(double investment, double interest) {
		double futureVal = investment;
		
		for (int i = 0; i < 12; i++) {
			futureVal = futureVal * (1 + interest * 0.01);
		}
		
		return futureVal;
	}

}
