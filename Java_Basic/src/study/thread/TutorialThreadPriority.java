package study.thread;

class MultiThread extends Thread {
	String name;
	
	public MultiThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(name + "(�켱 ����: "
								+ getPriority() + ")");
			
		}
	}
}

public class TutorialThreadPriority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread mt1 = new MultiThread("Thread0");
		MultiThread mt2 = new MultiThread("Thread1");
		MultiThread mt3 = new MultiThread("Thread2");
		
		mt1.setPriority(Thread.MIN_PRIORITY);
		mt2.setPriority(Thread.NORM_PRIORITY);
		mt3.setPriority(Thread.MAX_PRIORITY);
		
		/*
		 * Thread�� �켱 ������ 1~10 ������ ���� ������.
		 * 1�� MIN_PRIORITY 10�� MAX_PRIORITY
		 * ������ �켱 ������ ���ٰ��Ͽ� ó���� ���� �����ٴ� ������ ����.
		 */
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
