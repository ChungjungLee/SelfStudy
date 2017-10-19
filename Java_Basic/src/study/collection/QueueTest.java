package study.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int time = 10;
		
		// Queue�� interface�̱� ������ ��ü �����ϴ°� �Ұ�
		// LinkedList�� ������ �Ǿ������� ����� ��
		Queue<Integer> queue = new LinkedList<>();
		
		// queue�� ���� �־� �ʱ�ȭ
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
