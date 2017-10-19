package study.collection;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// PriorityQueue는 Queue처럼 interface가 아니라
		// Queue를 implements한 구체적인 class다.
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		/*
		 * PriorityQueue는 우선 순위에 따라서 추출한다.
		 * 단, 항상 정렬된 상태로 원소들이 저장되는 것은 아님에 유의.
		 */
		pq.add(30);
		pq.add(80);
		pq.add(20);
		pq.add(40);
		pq.add(50);
		pq.add(10);
		pq.add(100);
		
		System.out.println(pq);
		System.out.println("======");
		for (Integer o : pq) {
			System.out.println(o);
		}
		
		System.out.println("원소 삭제");
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

}
