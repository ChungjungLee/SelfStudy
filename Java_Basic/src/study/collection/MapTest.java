package study.collection;

import java.util.HashMap;
import java.util.Map;

class Student {
	int number;
	String name;
	
	public Student(int number, String name) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

public class MapTest {

	public static void main(String[] args) {
		/*
		 * Map�� interface�� ����Ǿ� �ֱ� ������ ��ü�� ������ �� ����.
		 * HashMap, TreeMap, LinkedHashMap ���� �̰��� implements�ϰ� �ִ�.
		 */
		// Map<key type, value type>
		// �츮�� ������ �����ϰ� ������ key�� �ƴ� value!
		Map<String, Student> st = new HashMap<>();
		
		st.put("20090001", new Student(20090001, "����ǥ"));
		st.put("20090002", new Student(20090002, "���ܵ�"));
		st.put("20090003", new Student(20090003, "������"));
		
		System.out.println(st);
		
		// �ϳ��� �׸��� �����Ѵ�.
		st.remove("20090002");
		
		// �ϳ��� �׸��� ��ġ�Ѵ�.
		st.put("20090003", new Student(20090003, "������"));
		
		// ���� �����Ѵ�.
		System.out.println(st.get("20090003"));
		
		// ��� �׸��� �湮�Ѵ�.
		/*
		 * Map�� ����� �����͸� �湮�� ���� Map.Entry��� interface�� ����ؾ߸� �Ѵ�.
		 * Map.Entry�� Map interface�� ���� interface�� ����Ǿ� �ִ�.
		 * 
		 * Map.entrySet()�� �ϰԵǸ� key�� value�� set�������� ������ �� �ִ�.
		 * �� �� set�� type�� Map.Entry
		 *  
		 */
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key=" + key + ", value="+value);
		}
		
		
	}

}
