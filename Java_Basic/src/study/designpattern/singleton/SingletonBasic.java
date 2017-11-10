package study.designpattern.singleton;

public class SingletonBasic {
	private static SingletonBasic instance;
	
	// �ܺο��� �ش� Ŭ������ �����ڸ� ���� ������ ���ϵ��� ����
	private SingletonBasic() {
		
	}
	
	/*
	 * �� �̱��� �������� ��Ƽ ������ �Ͽ��� ������ �߻��Ѵ�
	 * 
	 */
	public static SingletonBasic getInstance() {
		if (instance == null) {
			instance = new SingletonBasic();
		}
		return instance;
	}
}
