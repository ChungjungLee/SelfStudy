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
		 * Map은 interface로 선언되어 있기 때문에 객체를 생성할 수 없다.
		 * HashMap, TreeMap, LinkedHashMap 등이 이것을 implements하고 있다.
		 */
		// Map<key type, value type>
		// 우리가 실제로 저장하고 싶은건 key가 아닌 value!
		Map<String, Student> st = new HashMap<>();
		
		st.put("20090001", new Student(20090001, "구준표"));
		st.put("20090002", new Student(20090002, "금잔디"));
		st.put("20090003", new Student(20090003, "윤지후"));
		
		System.out.println(st);
		
		// 하나의 항목을 삭제한다.
		st.remove("20090002");
		
		// 하나의 항목을 대치한다.
		st.put("20090003", new Student(20090003, "소이정"));
		
		// 값을 참조한다.
		System.out.println(st.get("20090003"));
		
		// 모든 항목을 방문한다.
		/*
		 * Map에 저장된 데이터를 방문할 때는 Map.Entry라는 interface를 사용해야만 한다.
		 * Map.Entry는 Map interface의 내부 interface로 선언되어 있다.
		 * 
		 * Map.entrySet()을 하게되면 key와 value를 set형식으로 저장할 수 있다.
		 * 이 때 set의 type은 Map.Entry
		 *  
		 */
		for (Map.Entry<String, Student> s : st.entrySet()) {
			String key = s.getKey();
			Student value = s.getValue();
			System.out.println("key=" + key + ", value="+value);
		}
		
		
	}

}
