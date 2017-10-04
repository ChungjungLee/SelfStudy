package Method;
/*
 * Write a Java method to display the middle character of a string
 * 
 * Note: 
 * a) If the length of the string is odd there will be two middle characters.
 * b) If the length of the string is even there will be one middle character.
 * 
 * Test Data:
 * Input a string: 350
 * 
 * Expected Output:
 * The middle character in the string: 5
 */

public class Method_03 {

	public static void main(String[] args) {
		String str1 = "abcdefg";	// case a)
		String str2 = "abcdef";		// case b)
		
		System.out.println("middle chars of str1: " + middleChars(str1));
		System.out.println("middle chars of str2: " + middleChars(str2));
		
		System.out.println("middle chars of str1: " + middleChars_sample(str1));
		System.out.println("middle chars of str2: " + middleChars_sample(str2));
	}
	
	public static String middleChars(String str) {
		String result = "";
		int strLen = str.length();
		
		if (strLen % 2 != 0) {
			// case a)
			// result.concat(str.charAt(strLen / 2));
			// concat()은 String 타입의 parameter를 필요로 한다
			// result.copyValueOf(str.charAt(strLen/2));
			// copyValueOf()는 char[] 타입의 parameter를 필요로 한다
			
			result = result + str.charAt(strLen/2);
			// String 타입은 + 기호가 concatination의 의미를 가진다
		} else {
			// case b)
			result = result + str.charAt(strLen/2 - 1);
			result = result + str.charAt(strLen/2);
		}
		
		return result;
	}
	
	public static String middleChars_sample(String str) {
		// 홀짝을 먼저 구분
		int strLen = str.length();
		
		int startIndex;
		int endIndex;
		if (strLen % 2 != 0) {
			// case a)
			startIndex = strLen / 2;
			endIndex = strLen / 2;
		} else {
			startIndex = strLen / 2 - 1;
			endIndex = strLen / 2;
		}
		
		return str.substring(startIndex, endIndex + 1);
	}

}
