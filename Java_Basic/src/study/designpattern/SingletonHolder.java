package study.designpattern;

public class SingletonHolder {
	// 해당 클래스의 생성자
	private SingletonHolder() {
		
	}
	
	/*
	 * 코드가 컴파일될 때 
	 */
	private static class SingletonHolderHolder {
		private static final SingletonHolder INSTANCE = 
				new SingletonHolder();
	}
	
	// 호출하는 쪽에서 getInstance()를 부르면 현 클래스가 가지고 있는
	// 내부 클래스의 필드를 반환한다.
	public static SingletonHolder getInstance() {
		return SingletonHolderHolder.INSTANCE;
	}
}
