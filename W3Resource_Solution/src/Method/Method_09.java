package Method;
/*
 * Write a Java method to print characters 
 * between two characters (i.e. A to P ).
 * 
 * Note: Prints 20 characters per line
 * 
 * Expected Output:
 * ( ) * + , - . / 0 1 2 3 4 5 6 7 8 9 : ;
 * < = > ? @ A B C D E F G H I J K L M N O
 * P Q R S T U V W X Y Z [ \ ] ^ _ ` a b c
 * d e f g h i j k l m n o p q r s t u v w
 * x y z
 * 
 * */
import java.util.Scanner;

public class Method_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input a char: ");
		char startChar = sc.next().charAt(0);
		System.out.print("Input a char: ");
		char endChar = sc.next().charAt(0);
		
		printChars(startChar, endChar);
	}
	
	public static void printChars(char startChar, char endChar) {
		for (int i = startChar, lineCnt = 0; i <= endChar; i++, lineCnt++) {
			System.out.print((char)i + " ");
			
			if (lineCnt % 20 == 19) {
				System.out.print("\n");
			}
		}
	}

}
