package study.Enum;

public class EnumTest {

	
	public static void main(String[] args) {
		// enum class의 변수를 생성
		Person person = Person.JDM;
		
		/*
		 * .name()은 "enum constant name"을 반환한다.
		 * 즉, Map<>에서의 value라고 보면 될듯
		 */
		System.out.println(person.name());
		
		/*
		 * .ordinal()은 "index order"를 반환한다.
		 * enum class에서 선언된 순서대로 0부터 값을 가진다.
		 * 일반적으로는 사용할 경우가 없다.
		 */
		System.out.println(person.ordinal());
	}

}

enum Person {
	JDM, LHR
}