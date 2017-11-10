package study.designpattern.singleton;

public class SingletonEagerInit {
	/*
	 * 해당 클래스가 컴파일될 때 아예 필드를 생성하는데
	 * 이 때 생성자를 호출함으로써 instance를 가지고 있도록 한다.
	 * 
	 * 문제점은 사용하고 싶지 않을 때에도 생성이 되어있다는 것이다.
	 */
	private static SingletonEagerInit instance =
			new SingletonEagerInit();
	
	private SingletonEagerInit() {
		
	}
	
	public static SingletonEagerInit getInstance() {
		return instance;
	}
}
