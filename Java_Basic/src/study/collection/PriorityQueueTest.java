package study.collection;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		// PriorityQueue�� Queueó�� interface�� �ƴ϶�
		// Queue�� implements�� ��ü���� class��.
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		/*
		 * PriorityQueue�� �켱 ������ ���� �����Ѵ�.
		 * ��, �׻� ���ĵ� ���·� ���ҵ��� ����Ǵ� ���� �ƴԿ� ����.
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
		
		System.out.println("���� ����");
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

}
