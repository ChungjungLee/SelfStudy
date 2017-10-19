package study.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		/*
		 * HashSet�� ������ ������ �������� �ʴٴ� ��
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
		 * TreeSet�� ������ ������ ���� ũ�⿡ ���� ������
		 * Red-Black tree�� ������ �Ǳ� �����̴�.
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
		 * LinkedHashSet�� ������ ������ �Է��� ������ ����
		 * Hash table�� linked list�� ������ �ڷᱸ���� ����ϱ� ����.
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
