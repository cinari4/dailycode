import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		
		int result = 0;
		
		for (int i = 0; i < S.length() /3; i++) {
			String tmp = S.substring(i*3, i*3 + 3);
			if (tmp.charAt(0) != 'S')
				result++;
			
			if (tmp.charAt(1) != 'O')
				result++;
			
			if (tmp.charAt(2) != 'S')
				result++;
			
		}
		
		System.out.println(result);
	}
}
