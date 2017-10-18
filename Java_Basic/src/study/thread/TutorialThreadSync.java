package study.thread;

class clsNumber {
	int num = 0;
	
	/*
	 * 여러 thread가 동시에 이 함수를 실행시킬수 있다.
	 * num++; 표현만 놓고 봐도 중간에 다른 thread가
	 * 끼어들만한 시간이 충분하기 때문이다.
	 * 우리가 원하는 답이 나오지 않는 이유다.
	 */
	public void addNum() {
		num++;
	}
	
	/*
	 * synchronized 키워드를 이용해 다음의 함수가
	 * 동기화가 필요함을 선언.
	 * 여러 thread에 의해 동시에 실행되는 것을 방지. 
	 */
	public synchronized void addNumSync() {
		num++;
	}
	
	public void addNumSyncPart() {
		// 이 부분만 동기화 영역이다.
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
			mt1.join();	//mt1 스레드 수행 후 mt2를 수행
			// join(): 다른 스레드가 하는 일이 마무리 될때까지 기다린다.
			mt2.join();
			mt3.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(number.getNum());

	}

}
