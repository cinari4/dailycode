class Solution {
	public static void main(String[] args) {
		System.out.println(factorial(1));
		System.out.println(factorial(2));
		System.out.println(factorial(3));
		
		System.out.println(print(4));
		
	}
	
	/*
	 *  n! = 0,   (n == 0)
	 *  n! = n * (n-1)!   (n > 0)
	 */
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else if (n == 0) {
			return 0;
		} else {
			return n * factorial(n-1);
		}
	}
	
	public static int print(int n) {
		if (n == 0) {
			return 0;
		} else {
			System.out.println(n);
			return print(n-1);
		}
	}
	
}