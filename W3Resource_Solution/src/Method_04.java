/*
 * 
 * Write a Java method to count all vowels in a string
 * 
 * Test Data:
 * Input the string: w3resource
 * 
 * Expected Output:
 * Number of  Vowels in the string: 4
 */
public class Method_04 {
	public static void main(String[] args) {
		String str = "w3resources";
		
		System.out.println("Number Of vowels: " + numOfVowels(str));
	}
	
	public static int numOfVowels(String str) {
		int result = 0;
		int strLen = str.length();
		
		for (int i = 0; i < strLen; i++) {
			switch (str.charAt(i)) {
				case 'a': case 'e': case 'i': 
				case 'o': case 'u':
					result++;
					break;
					
				default:
					break;
			}
		}
		
		return result;
	}
}
