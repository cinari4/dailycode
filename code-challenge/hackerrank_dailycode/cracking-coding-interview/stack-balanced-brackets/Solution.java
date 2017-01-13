import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static boolean isBalanced(String expression) {
		if (expression.length() % 2 != 0) {
			return false;
		} else {
			int i = 0;
			int lastIndex = expression.length() - 1;
			
			while (i < lastIndex) {
				if (!isOppositeBrackets(expression.charAt(i), expression.charAt(lastIndex))) {
					return false;
				}
				i++;
				lastIndex--;
			}
			
			return true;
		}
	}
	
	public static boolean isOppositeBrackets(char ch1, char ch2) {
		if (ch1 == '{' && ch2 == '}') {
			return true;
		} else if (ch1 == '[' && ch2 == ']') {
			return true;
		} else if (ch1 == '(' && ch2 ==')') {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			boolean answer = isBalanced(expression);
			if(answer)
				System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
