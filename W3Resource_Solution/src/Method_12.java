/*
 * Write a Java method (takes a number n as input) 
 * to displays an n-by-n matrix.
 * 
 * Expected Output:
 * Input a number: 10
 * 1 0 0 1 1 0 0 0 1 1
 * 0 0 1 0 1 0 1 0 0 0
 * 0 1 0 1 0 0 0 0 0 1
 * 1 1 1 0 0 0 0 1 1 1
 * 1 1 0 1 1 1 0 1 0 0
 * 1 0 0 0 1 1 0 0 0 0
 * 0 0 1 0 0 0 0 1 1 1
 * 1 1 0 1 0 1 0 0 1 0
 * 0 0 1 0 0 0 0 1 1 0
 * 1 1 1 0 0 1 1 1 1 0
 */
public class Method_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNbyN(5);
	}
	
	public static void printNbyN(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((int) (Math.random()*2));
			}
			System.out.println();
		}
	}

}
