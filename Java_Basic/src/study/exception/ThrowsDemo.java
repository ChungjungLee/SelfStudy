package study.exception;

public class ThrowsDemo {

	/*
	 * 메소드가 exception을 throw할 수 있도록 하는 키워드는 "throws"
	 * 
	 * 클래스를 exception의 subclass로 만들어 사용자 정의 예외 클래스를
	 * 만들고 예외를 throw할 수 있도록 하는 키워드는 "throw"
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ThrowsDemo td = new ThrowsDemo();
			//td.test();
			test();
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
	
	/*
	 * 예외가 발생했을때 직접 처리하는게 아니라
	 * 자신을 호출한 쪽으로 예외를 던지도록 할 때
	 * throws를 사용한다.
	 */
	public static void test() throws ArithmeticException{
		System.out.println(3/0);
	}

}
