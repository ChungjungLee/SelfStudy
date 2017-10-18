package study.thread;

class clsNumber {
	int num = 0;
	
	/*
	 * ���� thread�� ���ÿ� �� �Լ��� �����ų�� �ִ�.
	 * num++; ǥ���� ���� ���� �߰��� �ٸ� thread��
	 * ����鸸�� �ð��� ����ϱ� �����̴�.
	 * �츮�� ���ϴ� ���� ������ �ʴ� ������.
	 */
	public void addNum() {
		num++;
	}
	
	/*
	 * synchronized Ű���带 �̿��� ������ �Լ���
	 * ����ȭ�� �ʿ����� ����.
	 * ���� thread�� ���� ���ÿ� ����Ǵ� ���� ����. 
	 */
	public synchronized void addNumSync() {
		num++;
	}
	
	public void addNumSyncPart() {
		// �� �κи� ����ȭ �����̴�.
		synchronized(this) {
			num++;
		}
	}
	
	public int getNum() {
		return this.num;
	}
}

class MultiThread_Sync extends Thread {
	clsNumber number;
	
	public MultiThread_Sync(clsNumber cn) {
		number = cn;
	}
	
	public void run() {
		for (int i = 0; i < 5000; i++) {
			number.addNumSync();
		}
	}
}

public class TutorialThreadSync {

	public static void main(String[] args) {
		clsNumber number = new clsNumber();
		MultiThread_Sync mt1 = new MultiThread_Sync(number);
		MultiThread_Sync mt2 = new MultiThread_Sync(number);
		MultiThread_Sync mt3 = new MultiThread_Sync(number);
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		
		try {
			mt1.join();	//mt1 ������ ���� �� mt2�� ����
			// join(): �ٸ� �����尡 �ϴ� ���� ������ �ɶ����� ��ٸ���.
			mt2.join();
			mt3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(number.getNum());

	}

}
