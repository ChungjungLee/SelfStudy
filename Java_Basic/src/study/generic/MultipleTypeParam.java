package study.generic;

// public class, interface는 파일에 하나만 존재해야 함
interface Pair<K, V> {
	public K getKey();
	public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

	private K key;
	private V value;
	
	public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	@Override
	public K getKey() {
		return key;
	}

	@Override
	public V getValue() {
		return value;
	}
	
}


public class MultipleTypeParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<String, Integer> p1 = 
				new OrderedPair<>("Even", 8);
		Pair<String, String> p2 = 
				new OrderedPair<>("hello", "world");
		
		System.out.println(
				p1.getKey() + "," + p1.getValue());
		System.out.println(
				p2.getKey() + "," + p2.getValue());
		
	}

}
