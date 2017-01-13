import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cntTestCase = in.nextInt();
		for (int i = 0; i < cntTestCase; i++) {
			String s = in.next();
			System.out.println(getCost(s));
		}
		
		in.close();
	}
	
	public static int getCost(String s) {
		char[] arr = s.toCharArray();
		Set<Character> setChar = new HashSet<>();
		for (char c : arr) {
			setChar.add(c);
		}
		
		return setChar.size();
	}
}
