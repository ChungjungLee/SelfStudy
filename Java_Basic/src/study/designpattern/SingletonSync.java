package study.designpattern;

public class SingletonSync {
	private static SingletonSync instance;
	
	private SingletonSync() {
		
	}
	
	/*
	 * instance�� �����ϴ� �������� ��Ƽ �������� �������� �߻��߱� ������
	 * �ش� �޼ҵ带 ����ȭ���� ������ �ذ�
	 * �׷��� �ſ� ��ȿ������ ���� �ذ�
	 */
	public synchronized static SingletonSync getInstance() {
		if (instance == null) {
			instance = new SingletonSync();
		}
		return instance;
	}
}
