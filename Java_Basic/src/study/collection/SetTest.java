package study.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		/*
		 * HashSet은 원소의 순서가 일정하지 않다는 것
		 */
		set.add("Milk");
		set.add("Break");
		set.add("Butter");
		set.add("Cheese");
		set.add("Ham");
		set.add("Ham");
		
		System.out.println(set);
		
		System.out.println("==============");
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		/*
		 * TreeSet은 원소의 순서가 값의 크기에 따라 정해짐
		 * Red-Black tree에 저장이 되기 때문이다.
		 */
		treeSet.add("Milk");
		treeSet.add("Break");
		treeSet.add("Butter");
		treeSet.add("Cheese");
		treeSet.add("Ham");
		treeSet.add("Ham");
		
		System.out.println(treeSet);
		
		System.out.println("==============");
		
		LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
		
		/*
		 * LinkedHashSet은 원소의 순서가 입력한 순서와 같다
		 * Hash table과 linked list를 결합한 자료구조를 사용하기 때문.
		 */
		linkedSet.add("Milk");
		linkedSet.add("Break");
		linkedSet.add("Butter");
		linkedSet.add("Cheese");
		linkedSet.add("Ham");
		linkedSet.add("Ham");
		
		System.out.println(linkedSet);
	}

}
