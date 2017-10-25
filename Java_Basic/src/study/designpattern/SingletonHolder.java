package study.designpattern;

public class SingletonHolder {
	// �ش� Ŭ������ ������
	private SingletonHolder() {
		
	}
	
	/*
	 * �ڵ尡 �����ϵ� �� 
	 */
	private static class SingletonHolderHolder {
		private static final SingletonHolder INSTANCE = 
				new SingletonHolder();
	}
	
	// ȣ���ϴ� �ʿ��� getInstance()�� �θ��� �� Ŭ������ ������ �ִ�
	// ���� Ŭ������ �ʵ带 ��ȯ�Ѵ�.
	public static SingletonHolder getInstance() {
		return SingletonHolderHolder.INSTANCE;
	}
}
