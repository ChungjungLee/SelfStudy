/*
 * Write a Java method to count all words in a string.
 * 
 * Test Data:
 * Input the string: The quick brown fox jumps over the lazy dog.
 * 
 * Expected Output:
 * Number of words in the string: 9
 * 
 */
public class Method_05 {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog.";
		
		System.out.println("the number of all words: " + numberOfWords_Split(str));
	}
	
	public static int numberOfWords(String str) {
		int result = 0;
		int strLen = str.length();
		
		if (strLen != 0) {
			result++;
		}
		
		for (int i = 0; i < strLen; i++) {
			if (str.charAt(i) == ' ') {
				result++;
			}
		}
		
		return result;
	}
	
	public static int numberOfWords_Split(String str) {
		int result = 0;
		
		/*
		while (str.split(" ") != null) {
			// split()으로부터 반환되는 값이 String[]이므로 무한반복에 빠지게 된다
			result++;
		}
		*/
		
		for (String word : str.split(" ")) {
			// split()의 반환값은 잘려진 String의 배열이다. String[]가 return type
			result++;
		}
		
		return result;
	}
}
