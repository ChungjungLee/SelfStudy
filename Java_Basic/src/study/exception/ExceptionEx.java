package study.exception;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 25;
		
		int result;
		
		for (int i = 0; i < 10; i++) {
			
			/*
			 * try-catch flow
			 * ���� try ����� �����Ű�� ���ܰ� �߻��Ѵٸ�
			 * ������ ����� �������� �ʰ� catch ����� �����Ѵ�.
			 * 
			 * try ����� ������ �����ߴµ� ���ܰ� �߻����� �ʾҴٸ�
			 * catch ����� ���� �������� �ʰ� �Ѿ��.
			 */
			try {
				int num2 = (int)(Math.random() * 10);
				result = num1 / num2;
				
				System.out.println(result);
			} catch (ArithmeticException e) {
				// divide by 0�� �� �� ���� �� �ִ� ��Ÿ�� ������
				// Ư�� ArithmeticException�� ����ش�.
				System.out.println("���� 0���� ������ �Ұ�");
			}
			
			
			/*
			 * try-catch-finally flow
			 * �⺻�����δ� ���� try-catch flow�� ���� �帧�̴�.
			 * �ٸ� ���ܰ� �߻��ߵ� �� �ߵ� finally ����� �����Ѵٴ� ���̴�.
			 */
			try {
				
			} catch(Exception e) {
				
			} finally {
				
			}
		}
		
	}

}
