package Method;
/*
 * Write a Java method to check whether a string is a valid password.
 * 
 * Password rules:
 * A password must have at least eight characters.
 * A password consists of only letters and digits.
 * A password must contain at least two digits.
 * 
 * Expected Output:
 * 1. A password must have at least eight characters.
 * 2. A password consists of only letters and digits.
 * 3. A password must contain at least two digits
 * 
 * Input a password : abcd1234
 * Password is valid: abcd1234 
 * 
 * */
import java.util.Scanner;

public class Method_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a password: ");
		String password = sc.next();
		
		switch (isValidPwd(password)) {
			case 1:
				System.out.println("Password is invalid.");
				System.out.println("A password must have at least eight characters.");
				break;
				
			case 2:
				System.out.println("Password is invalid.");
				System.out.println("A password consists of only letters and digits.");
				break;
				
			case 3:
				System.out.println("Password is invalid.");
				System.out.println("A password must contain at least two digits.");
				break;
				
			default:
				System.out.println("Password is valid.");
		}
	}
	
	public static int isValidPwd(String password) {
		// case 1) at least 8 chars
		if (password.length() < 8) {
			return 1;
		}
		
		// case 2) only letters and digits
		for (int i = 0; i < password.length(); i++) {
			char candidate = password.charAt(i);
			
			if (!isCharOrDigit(candidate)) {
				return 2;
			}
			
		}
		
		// case 3) at least 2 digits
		int numOfDigits = 0;
		for (int i = 0; i < password.length(); i++) {
			
			if ('0' <= password.charAt(i) && password.charAt(i) <= '9') {
				numOfDigits++;
			}
			
		}
		
		if (numOfDigits < 2) {
			return 3;
		}
		
		return 0;
	}
	
	public static boolean isCharOrDigit(char candidate) {
		if ('0' <= candidate && candidate <= '9') {
			return true;
		} else if (('a' <= candidate && candidate <= 'z') ||
					('A' <= candidate && candidate <= 'Z')) {
			return true;
		} else {
			return false;
		}
	}

}
