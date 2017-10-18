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
			// iterator class�� next() �Լ��� 
			// ���� ��, object�� ��ȯ�Ѵ�.
			// ��ȯ ���� ���Ҹ� down-casting�Ͽ� ���
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
