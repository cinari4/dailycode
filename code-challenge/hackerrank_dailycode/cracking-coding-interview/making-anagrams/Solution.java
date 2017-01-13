import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
	public static int numberNeeded(String first, String second) {
		Map<Character, Integer> resultMap = new HashMap<>();
		for (Character c : first.toCharArray()) {
			if (resultMap.containsKey(c)) {
				resultMap.put(c, resultMap.get(c) + 1);
			} else {
				resultMap.put(c, 1);
			}
		}
		
		for (Character c : second.toCharArray()) {
			if (resultMap.containsKey(c)) {
				resultMap.put(c, resultMap.get(c) + -1);
			} else {
				resultMap.put(c, -1);
			}
		}
		
		int toRemoveCnt = 0;
		for (Map.Entry<Character, Integer> entry : resultMap.entrySet()) {
			if (entry.getValue() != 0) {
				toRemoveCnt += Math.abs(entry.getValue());
			}
		}
		return toRemoveCnt;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		System.out.println(numberNeeded(a, b));
	}
}

/* input
cde
abc
*/

/* output
4
*/