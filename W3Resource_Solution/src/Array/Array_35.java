package Array;

/*
 * Write a Java program to find the sum of the two elements 
 * of a given array which is equal to a given integer.
 * 
 * Sample array: [1,2,4,5,6]
 * Target value: 6.
 * Sample output: index 1, 2
 * 
 */
public class Array_35 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6 };
		int target = 6;
		// ���ĵǾ��� ����
		
		for (int i = 0; i < arr.length; i++) {
			if (target < arr[i]) {
				//�� �̻� �����ϴ� ������ ����
				break;
			} 
			
			int newTarget = target - arr[i];
			
			for (int j = i + 1; j < arr.length; j++) {
				if (newTarget < arr[j]) {
					//�� �̻� �����ϴ� ������ ����
					break;
				} else if (newTarget == arr[j]) {
					//ã��
					System.out.println("Index " + i + " and index " + j);
				}
			}
		}
	}
}
