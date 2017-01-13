import java.io.*;
import java.util.*;

public class Solution {

	static boolean isAnagram(String A, String B) {
		String strA = A.toLowerCase();
		String strB = B.toLowerCase();

		if (strA.length() != strB.length())
			return false;

		if (strA.equals(strB))
			return true;

		int[] count = new int[26];
		for (int i = 0; i < count.length; i++)
			count[i] = 0;

		for (int i = 0; i < strA.length(); i++) {
			count[(int) strA.charAt(i) - 97]++;
			count[(int) strB.charAt(i) - 97]--;
		}

		for (int i = 0; i < count.length; i++)
			if (count[i] != 0)
				return false;
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}
}
