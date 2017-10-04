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
	// isPrime(i)�� ����� ����� ���� �迭
	// 0: �Ǻ��� �� ����, 1: �Ҽ�, 2: �Ҽ� �ƴ�
	private static final int FIND_LIMIT = 1000000;
	
	public static void main(String[] args) {
		printPrimeNumber(FIND_LIMIT);
	}

	public static void printPrimeNumber(int limit) {
		// isPrime(i)�� ����� ����� ���� ���� �迭�� �����ϰ�
		// 0���� initialization
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
		 * prime���� �����ϴ� ��
		 * 
		 * 1) primeCalculated�� �ش� ������ �Ǻ� ���ΰ� ����� �ִٸ�
		 * 		�׿� ���� true/false�� ��ȯ
		 * 2) �Ǻ��� ���� ���ٸ� prime���� ���θ� Ȯ���ϰ� �� ����� ����
		 * 		1: �Ҽ�, 2: �Ҽ� �ƴ�
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
