package study.thread;

class MultiThread_Thread extends Thread {
	String name;
	
	public MultiThread_Thread(String name) {
		System.out.println(getName() + " ������ ����");
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + "("
								+ name + ")");
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MultiThread_Runnable implements Runnable {
	String name;
	
	public MultiThread_Runnable(String name) {
		System.out.println(name + "������ ����");
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			/*
			 * Thread class�� extends���� �����Ƿ� Thread class��
			 * �ʵ峪 �Լ��� ����� �� ����.
			 * �׷��� Thread.�� �̿��Ͽ� ����ؾ� �Ѵ�.
			 */
			System.out.println(Thread.currentThread().getName()
								+ "(" + name + ")");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

public class TutorialThread {

	public static void main(String[] args) {
		/*
		 * Thread class�� extends�ϴ� class�� �����ڸ� ���ؼ�
		 * ���� ��ü�� start() method�� ���ԵǾ� �ִ�.
		 * ���� variable.start();�� �����ϴ�
		 */
		MultiThread_Thread mt1 = new MultiThread_Thread("Thread0");
		MultiThread_Thread mt2 = new MultiThread_Thread("Thread1");
		MultiThread_Thread mt3 = new MultiThread_Thread("Thread2");
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		/*
		 * Runnable interface�� implements�ϴ� class�� �����ڸ� ����
		 * ���� ��ü�� start() method�� ���ԵǾ� ���� �ʴ�.
		 * ���� Thread class�� ������ parameter�� ��ü�� �Ѱ��־�� �Ѵ�.
		 */
		Thread mt1_r = 
				new Thread(new MultiThread_Runnable("Runnable0"));
		Thread mt2_r = 
				new Thread(new MultiThread_Runnable("Runnable1"));
		Thread mt3_r = 
				new Thread(new MultiThread_Runnable("Runnable2"));
		
		mt1_r.start();
		mt2_r.start();
		mt3_r.start();
	}

}
