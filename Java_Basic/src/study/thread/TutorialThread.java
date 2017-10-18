package study.thread;

class MultiThread_Thread extends Thread {
	String name;
	
	public MultiThread_Thread(String name) {
		System.out.println(getName() + " 스레드 생성");
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
		System.out.println(name + "스레드 생성");
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			/*
			 * Thread class를 extends하지 않으므로 Thread class의
			 * 필드나 함수를 사용할 수 없다.
			 * 그래서 Thread.를 이용하여 사용해야 한다.
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
		 * Thread class를 extends하는 class는 생성자를 통해서
		 * 만든 객체에 start() method가 포함되어 있다.
		 * 따라서 variable.start();가 가능하다
		 */
		MultiThread_Thread mt1 = new MultiThread_Thread("Thread0");
		MultiThread_Thread mt2 = new MultiThread_Thread("Thread1");
		MultiThread_Thread mt3 = new MultiThread_Thread("Thread2");
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		/*
		 * Runnable interface를 implements하는 class는 생성자를 통해
		 * 만든 객체에 start() method가 포함되어 있지 않다.
		 * 따라서 Thread class의 생성자 parameter로 객체를 넘겨주어야 한다.
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
