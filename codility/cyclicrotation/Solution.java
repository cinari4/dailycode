class Solution {
	
	public static void main(String[] args) {
		int[] A = new int[5];
		A[0] = 3;
		A[1] = 8;
		A[2] = 9;
		A[3] = 7;
		A[4] = 6;
		printArr(solution(A, 0));
		printArr(solution(A, 1));
		printArr(solution(A, 2));
		printArr(solution(A, 3));
		printArr(solution(A, 4));
		printArr(solution(A, 5));
		printArr(solution(A, 6));
		printArr(solution(A, 7));
		System.out.println("========");
		printArr(solution(A, -1));
		printArr(solution(A, -2));
		printArr(solution(A, -3));
		
	}
	
	public static void printArr(int[] A) {
		StringBuilder sb = new StringBuilder();
		for (int i : A) {
			sb.append(i + " ");
		}
		System.out.println(sb.toString());
	}
	
	public static int[] solution(int[] A, int K) {
		if (K == 0) {
			return A;
		}
		
		if (K >= A.length) {
			K = K % A.length;
		}
		
		int[] arr = new int[A.length];
		for (int i = 0; i < arr.length; i++) {
			arr[K++] = A[i];
			if (K >= A.length)
				K = 0;
		}
		
		return arr;
	}
}