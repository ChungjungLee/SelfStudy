package study.designpattern.singleton;

public class SingletonBasic {
	private static SingletonBasic instance;
	
	// 외부에서 해당 클래스를 생성자를 통해 만들지 못하도록 봉쇄
	private SingletonBasic() {
		
	}
	
	/*
	 * 이 싱글톤 디자인은 멀티 쓰레드 하에서 오류가 발생한다
	 * 
	 */
	public static SingletonBasic getInstance() {
		if (instance == null) {
			instance = new SingletonBasic();
		}
		return instance;
	}
}
