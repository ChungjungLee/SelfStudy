package study.thread;

class MultiThread extends Thread {
	String name;
	
	public MultiThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(name + "(우선 순위: "
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
		 * Thread의 우선 순위는 1~10 사이의 값을 가진다.
		 * 1이 MIN_PRIORITY 10이 MAX_PRIORITY
		 * 하지만 우선 순위가 높다고하여 처리가 먼저 끝난다는 보장은 없다.
		 */
		mt1.start();
		mt2.start();
		mt3.start();
	}

}
