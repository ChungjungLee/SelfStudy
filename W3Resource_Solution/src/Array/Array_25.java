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
		 * 공통된 원소 찾기 (2개의 배열만 비교하기를 반복)
		 * 
		 * */
		
		
		
	}
	
	public static void findCommon(int[] arr1, int[] arr2, int[] arr3, int[] indexArr) {
		/*
		 * 공통된 원소 찾기 (3개의 배열을 동시에 비교하기)
		 * 
		 * 1) 세 배열 중 하나라도 끝까지 비교했다면 더 이상 반복할 필요 없음
		 * 1) 현재 가리키고 있는 index의 원소값을 비교
		 * 2) 같지 않다면; 가장 큰 원소값보다 작거나 같을 때까지 index들을 이동시킨다
		 * 3) 같다면; 공통 원소값을 저장하는 배열에 저장 후 모든 index + 1
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
			// 가장 큰 값을 찾는다
			int max = arr1[indexArr[0]];
			if (max < arr2[indexArr[1]]) {
				max = arr2[indexArr[1]];
			}
			if (max < arr3[indexArr[2]]) {
				max = arr3[indexArr[2]];
			}
			
			// case 2)
			// 배열의 index 이동
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
