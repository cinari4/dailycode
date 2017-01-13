public class Solv {
	public static void main(String[] args) {
		int n = 10;
		int k = 3;
		System.out.println(getPermutation(n, k));
	}
	
	public static int getPermutation(int n, int k) {
		
		// wrong situation
		if (n < k) {
			return -1;
		}
		
		if (k == 0 || k == n) {
			return 1;
		}
		
		return getMultiply(n, n - k)/getFactorial(k);
	}
	
	public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
	}
	
	public static int getMultiply(int start, int end) {
		int sum = 1;
		for (int i = start; i > end; i--) {
			sum *= i;
		}
		return sum;
	}
}
