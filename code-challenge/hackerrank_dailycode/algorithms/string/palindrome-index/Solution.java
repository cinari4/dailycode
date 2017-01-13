import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cntTestCase = in.nextInt();
		
		for (int i = 0; i < cntTestCase; i++) {
			String tmp = in.next();
			System.out.println(getPalindromeIndex(tmp));
		}
	}

	private static int getPalindromeIndex(String plainText) {
		if (isPalindrome(plainText)) {
			return -1;
		}
		
		for (int i = 0; i < plainText.length(); i++) {
			StringBuilder sb = new StringBuilder(plainText);
			if (isPalindrome(sb.deleteCharAt(i).toString())) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		char[] chStr = str.toCharArray();
		
		while (start <= end) {
			if (chStr[start] != chStr[end])
				return false;
			start++; end--;
		}
		return true;
	}
}