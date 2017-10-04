package Method;
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
	private static char[] primeCalculated;
	// isPrime(i)의 결과를 기록해 놓는 배열
	// 0: 판별된 적 없음, 1: 소수, 2: 소수 아님
	private static final int FIND_LIMIT = 1000000;
	
	public static void main(String[] args) {
		printPrimeNumber(FIND_LIMIT);
	}

	public static void printPrimeNumber(int limit) {
		// isPrime(i)의 결과를 기록해 놓기 위해 배열을 생성하고
		// 0으로 initialization
		primeCalculated = new char[FIND_LIMIT];
		for (int i = 0; i < FIND_LIMIT; i++) {
			primeCalculated[i] = 0;
		}
		
		int numOfPrimePair = 0;
		for (int i = 1; i <= limit - 2; i++) {
			if (isPrime(i) && isPrime(i + 2)) {
				numOfPrimePair++;
				//System.out.printf("(%d, %d)\n", i, i + 2);
			}
		}
		System.out.println("# of prime pair until " + FIND_LIMIT + " is " + numOfPrimePair);
	}
	
	public static boolean isPrime(int candidate) {
		/* 
		 * prime인지 구별하는 법
		 * 
		 * 1) primeCalculated에 해당 숫자의 판별 여부가 저장돼 있다면
		 * 		그에 따른 true/false를 반환
		 * 2) 판별된 적이 없다면 prime인지 여부를 확인하고 그 결과를 저장
		 * 		1: 소수, 2: 소수 아님
		 * */
		
		if (primeCalculated[candidate - 1] != 0) {
			// 1)
			if (primeCalculated[candidate - 1] == 1) {
				return true;
			} else {
				return false;
			}
		} else {
			// 2)
			for (int i = 2; i < candidate; i++) {
				if (candidate % i == 0) {
					primeCalculated[candidate - 1] = 2;
					return false;
				}
			}
			
			primeCalculated[candidate - 1] = 1;
			return true;
		}
		
	}
}
