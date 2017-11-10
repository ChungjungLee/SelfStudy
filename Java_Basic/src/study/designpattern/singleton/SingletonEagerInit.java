package study.designpattern.singleton;

public class SingletonEagerInit {
	/*
	 * �ش� Ŭ������ �����ϵ� �� �ƿ� �ʵ带 �����ϴµ�
	 * �� �� �����ڸ� ȣ�������ν� instance�� ������ �ֵ��� �Ѵ�.
	 * 
	 * �������� ����ϰ� ���� ���� ������ ������ �Ǿ��ִٴ� ���̴�.
	 */
	private static SingletonEagerInit instance =
			new SingletonEagerInit();
	
	private SingletonEagerInit() {
		
	}
	
	public static SingletonEagerInit getInstance() {
		return instance;
	}
}
