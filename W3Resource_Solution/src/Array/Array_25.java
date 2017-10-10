package Array;
/*
 * Write a Java program to find 
 * common elements from three sorted (in non-decreasing order) arrays.
 * 
 * */
public class Array_25 {

	public static void main(String[] args) {
		int[] arr1 = { 0, 2, 3, 7, 10 };
		int[] arr2 = { 0, 1, 4, 6, 7, 8, 10 };
		int[] arr3 = { 1, 2, 7, 10, 11 };
		
		int[] indexArr = { 0, 0, 0 };
		
		findCommon(arr1, arr2, arr3, indexArr);
		
		/*
		 * ����� ���� ã�� (2���� �迭�� ���ϱ⸦ �ݺ�)
		 * 
		 * */
		
		
		
	}
	
	public static void findCommon(int[] arr1, int[] arr2, int[] arr3, int[] indexArr) {
		/*
		 * ����� ���� ã�� (3���� �迭�� ���ÿ� ���ϱ�)
		 * 
		 * 1) �� �迭 �� �ϳ��� ������ ���ߴٸ� �� �̻� �ݺ��� �ʿ� ����
		 * 1) ���� ����Ű�� �ִ� index�� ���Ұ��� ��
		 * 2) ���� �ʴٸ�; ���� ū ���Ұ����� �۰ų� ���� ������ index���� �̵���Ų��
		 * 3) ���ٸ�; ���� ���Ұ��� �����ϴ� �迭�� ���� �� ��� index + 1
		 * 
		 * */
		while (indexArr[0] < arr1.length && 
				indexArr[1] < arr2.length &&
				indexArr[2] < arr3.length) {
			
			if(arr1[indexArr[0]] == arr2[indexArr[1]] &&
				arr2[indexArr[1]] == arr3[indexArr[2]]) {
				// case 3)
				System.out.print(arr1[indexArr[0]] + " ");
				for (int i = 0; i < indexArr.length; i++) {
					indexArr[i]++;
				}
				continue;
			}
			
			// case 2)
			// ���� ū ���� ã�´�
			int max = arr1[indexArr[0]];
			if (max < arr2[indexArr[1]]) {
				max = arr2[indexArr[1]];
			}
			if (max < arr3[indexArr[2]]) {
				max = arr3[indexArr[2]];
			}
			
			// case 2)
			// �迭�� index �̵�
			while (indexArr[0] < arr1.length && arr1[indexArr[0]] < max) { 
				indexArr[0]++;
			}
			while (indexArr[1] < arr2.length && arr2[indexArr[1]] < max) {
				indexArr[1]++;
			}
			while (indexArr[2] < arr3.length && arr3[indexArr[2]] < max) {
				indexArr[2]++;
			}
			
		}
	}
	

}
