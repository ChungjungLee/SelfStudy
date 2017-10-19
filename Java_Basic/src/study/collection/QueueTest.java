package study.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int time = 10;
		
		// Queue는 interface이기 때문에 객체 생성하는게 불가
		// LinkedList로 구현이 되어있음을 명심할 것
		Queue<Integer> queue = new LinkedList<>();
		
		// queue에 값을 넣어 초기화
		for (int i = time; i >= 0; i--) {
			queue.add(i);
		}
		
		System.out.println(queue.toString());
		
		while(!queue.isEmpty()) {
			System.out.print(queue.remove() + " ");
			Thread.sleep(1000);
		}
	}

}
