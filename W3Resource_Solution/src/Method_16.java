/*
 * Write a Java method to find all twin prime numbers less than 100.
 * 
 * Expected Output:
 * (3, 5)
 * (5, 7)
 * (11, 13)
 * (17, 19)
 * (29, 31)
 * (41, 43)
 * (59, 61)
 * (71, 73)
 *  
 * */
public class Method_16 {

	public static void main(String[] args) {
		final int FIND_LIMIT = 100;
		printPrimeNumber(FIND_LIMIT);
	}

	public static void printPrimeNumber(int limit) {
		/* 더 효율적인 알고리즘이 있을 것이다. isPrime(i)의 결과를 기록해 놓는 배열 등 이용 */
		for (int i = 1; i <= limit - 2; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				System.out.printf("(%d, %d)\n", i, i + 2);
			}
		}
	}
	
	public static boolean isPrime(int candidate) {
		for (int i = 2; i < candidate; i++) {
			if (candidate % i == 0) {
				return false;
			}
		}
		return true;
	}
}
