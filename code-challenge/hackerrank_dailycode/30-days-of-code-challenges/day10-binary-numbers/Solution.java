import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();
		
		String strBinary = intToBinary(n);
		int max = 0;
		int cnt = 0;
		for (int i = 0; i < strBinary.length(); i++) {
			if (strBinary.charAt(i) == '1') {
				cnt++;
				max = Math.max(max, cnt);
			} else {
				cnt = 0;
			}
		}
		System.out.println(max);
		
	}
	
	public static String intToBinary(int n) {
		StringBuilder sb = new StringBuilder();
		int remain = 0;
		
		while (n / 2 > 0) {
			remain = n % 2;
			sb.append(remain);
			
			n = n / 2;
		}
		
		if (n == 1) {
			sb.append(n);
		}
		
		return sb.reverse().toString();
	}
}
