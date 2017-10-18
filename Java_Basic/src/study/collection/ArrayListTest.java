package study.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		String s;
		Iterator e = list.iterator();
				
		while (e.hasNext()) {
			String ss = (String) e.next();
			// iterator class의 next() 함수는 
			// 원소 즉, object를 반환한다.
			// 반환 받은 원소를 down-casting하여 사용
			System.out.println(ss);
		}
		
		System.out.println("===============");
		
		ListIterator le = list.listIterator();
		
		while (le.hasNext()) {
			System.out.println((String) le.next());
		}
		
		System.out.println("===============");
		
		ListIterator le2 = list.listIterator(1);
		
		while (le2.hasPrevious()) {
			System.out.println((String) le2.previous());
		}
	}

}
