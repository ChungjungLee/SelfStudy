package study.Enum;

public class EnumTest {

	
	public static void main(String[] args) {
		// enum class�� ������ ����
		Person person = Person.JDM;
		
		/*
		 * .name()�� "enum constant name"�� ��ȯ�Ѵ�.
		 * ��, Map<>������ value��� ���� �ɵ�
		 */
		System.out.println(person.name());
		
		/*
		 * .ordinal()�� "index order"�� ��ȯ�Ѵ�.
		 * enum class���� ����� ������� 0���� ���� ������.
		 * �Ϲ������δ� ����� ��찡 ����.
		 */
		System.out.println(person.ordinal());
	}

}

enum Person {
	JDM, LHR
}