package study.exception;

public class ThrowsDemo {

	/*
	 * �޼ҵ尡 exception�� throw�� �� �ֵ��� �ϴ� Ű����� "throws"
	 * 
	 * Ŭ������ exception�� subclass�� ����� ����� ���� ���� Ŭ������
	 * ����� ���ܸ� throw�� �� �ֵ��� �ϴ� Ű����� "throw"
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ThrowsDemo td = new ThrowsDemo();
			//td.test();
			test();
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
	}
	
	/*
	 * ���ܰ� �߻������� ���� ó���ϴ°� �ƴ϶�
	 * �ڽ��� ȣ���� ������ ���ܸ� �������� �� ��
	 * throws�� ����Ѵ�.
	 */
	public static void test() throws ArithmeticException{
		System.out.println(3/0);
	}

}
