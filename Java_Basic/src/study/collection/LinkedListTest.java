package study.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		String s;
		Iterator e = list.iterator();
				
		while (e.hasNext()) {
			String ss = (String) e.next();
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
