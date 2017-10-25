package study.exception;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 25;
		
		int result;
		
		for (int i = 0; i < 10; i++) {
			
			/*
			 * try-catch flow
			 * 먼저 try 블록을 실행시키고 예외가 발생한다면
			 * 나머지 블록을 실행하지 않고 catch 블록을 실행한다.
			 * 
			 * try 블록을 끝까지 진행했는데 예외가 발생하지 않았다면
			 * catch 블록은 전혀 실행하지 않고 넘어간다.
			 */
			try {
				int num2 = (int)(Math.random() * 10);
				result = num1 / num2;
				
				System.out.println(result);
			} catch (ArithmeticException e) {
				// divide by 0를 할 때 생길 수 있는 런타임 오류를
				// 특히 ArithmeticException을 잡아준다.
				System.out.println("숫자 0으로 나눗셈 불가");
			}
			
			
			/*
			 * try-catch-finally flow
			 * 기본적으로는 위의 try-catch flow와 같은 흐름이다.
			 * 다만 예외가 발생했든 안 했든 finally 블록을 실행한다는 것이다.
			 */
			try {
				
			} catch(Exception e) {
				
			} finally {
				
			}
		}
		
	}

}
