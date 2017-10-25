package study.designpattern;

public class SingletonSync {
	private static SingletonSync instance;
	
	private SingletonSync() {
		
	}
	
	/*
	 * instance를 생성하는 과정에서 멀티 쓰레드의 문제점이 발생했기 때문에
	 * 해당 메소드를 동기화시켜 문제를 해결
	 * 그러나 매우 비효율적인 문제 해결
	 */
	public synchronized static SingletonSync getInstance() {
		if (instance == null) {
			instance = new SingletonSync();
		}
		return instance;
	}
}
